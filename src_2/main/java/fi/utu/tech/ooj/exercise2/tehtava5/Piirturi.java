package fi.utu.tech.ooj.exercise2.tehtava5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Kutsutaan Main-luokasta
final public class Piirturi extends Application {
    // valitse tästä piirrettävä piirros:
    // Piirros1 .. PiirrosN tiedostossa Piirros.java
    //Piirros piirros() { return Piirros1.rakenna(); }
    //Piirros piirros() { return Piirros2.rakenna(); }
    Piirros piirros() { return Piirros3.rakenna(); }

    void piirräAlueille(PiirtoAlue[] alueet) {
        for(var alue: alueet) piirros().piirrä(alue);
    }

    // JAVAFX-toteutus - voidaan sivuuttaa tässä tehtävässä!
    // ei kuulu kurssin osaamistavoitteisiin
    private PiirtoAlue javafx(GraphicsContext context) {
        return new PiirtoAlue() {
            private void vaihdaVäri(Väri väri) {
                switch (väri) {
                    case Sininen:
                        context.setFill(Color.LIGHTSKYBLUE);
                        break;
                    case Punainen:
                        context.setFill(Color.INDIANRED);
                        break;
                    case Vihreä:
                        context.setFill(Color.SPRINGGREEN);
                        break;
                    case Oranssi:
                        context.setFill(Color.ORANGE);
                        break;
                    default:
                        context.setFill(Color.BLACK);
                }
            }

            public void piirräNeliö(Piste keski, double koko, Väri väri) {
                vaihdaVäri(väri);
                context.fillRect(keski.x - koko, keski.y - koko, koko, koko);
            }

            public void piirräKolmio(Piste keski, double koko, Väri väri) {
                vaihdaVäri(väri);
                Piste piste = new Piste(keski.x - koko / 2, keski.y - koko / 2);
                Piste p1 = piste.kehä(Math.PI * 1 / 6, koko / 2 / 37 * 50);
                Piste p2 = piste.kehä(Math.PI * 5 / 6, koko / 2 / 37 * 50);
                Piste p3 = piste.kehä(Math.PI * 9 / 6, koko / 2 / 37 * 50);

                double transY = piste.y - (p2.y + p3.y) / 2;
                p1 = new Piste(p1.x, p1.y + transY);
                p2 = new Piste(p2.x, p2.y + transY);
                p3 = new Piste(p3.x, p3.y + transY);

                context.fillPolygon(
                        new double[]{p1.x, p2.x, p3.x},
                        new double[]{p1.y, p2.y, p3.y},
                        3
                );
            }

            public void piirräYmpyrä(Piste keski, double koko, Väri väri) {
                vaihdaVäri(väri);
                context.fillOval(keski.x - koko, keski.y - koko, koko, koko);
            }
        };
    }

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        piirräAlueille(new PiirtoAlue[] {
                new Terminaali(),
                javafx(canvas.getGraphicsContext2D())
        });
        // FIXME: toinen tapa toteuttaa?

        stage.setTitle("Kuviopiirturi");
        stage.setScene(new Scene(
                new BorderPane() {
                    {
                        setCenter(canvas);
                        setTop(new BorderPane(new Label("Piirretään kuvioita!")));
                        setBottom(new BorderPane(new Label("Piirretään kuvioita!")));
                    }
                }
        ));
        stage.setWidth(500);
        stage.setHeight(570);
        stage.show();
    }
}
