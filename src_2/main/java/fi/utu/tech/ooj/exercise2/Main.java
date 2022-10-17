package fi.utu.tech.ooj.exercise2;

import fi.utu.tech.ooj.exercise2.tehtava3.Kurssi;
import fi.utu.tech.ooj.exercise2.tehtava3.Opiskelija;
import fi.utu.tech.ooj.exercise2.tehtava4.Pora;
import fi.utu.tech.ooj.exercise2.tehtava4.Sähköpora;
import fi.utu.tech.ooj.exercise2.tehtava4.Työkalu;
import fi.utu.tech.ooj.exercise2.tehtava4.TyökaluVarasto;
import fi.utu.tech.ooj.exercise2.tehtava5.Piirturi;
import javafx.application.Application;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Harjoitustyön pohja toimii");

        ArrayList<Työkalu> vehkeet = new ArrayList<>();
        Pora op = new Pora("Bosch", "superPora");
        Sähköpora sp = new Sähköpora("Ryobi", "kunnon behje");
        vehkeet.add(op);
        vehkeet.add(sp);

        TyökaluVarasto varasto1 = new TyökaluVarasto(vehkeet);

        // avataan piirturi
        // käynnistä: mvn javafx:run
        // Application.launch(Piirturi.class);

        /* Opiskelija essiEsimerkki = new Opiskelija("Essi Esimerkki", 1);
        Opiskelija johnDoe = new Opiskelija("John Doe", 2);

        ArrayList<Opiskelija> students1 = new ArrayList<>();
        students1.add(essiEsimerkki);

        HashMap<Opiskelija, Integer> grades1 = new HashMap<>();
        grades1.put(essiEsimerkki, 5);

        Kurssi ooj2 = new Kurssi("Olio ohjelmoinnin jatkokurssi", 5,
                "Paavo Väyrynen", students1, grades1);

        ooj2.addToCourse(students1, johnDoe);

        ooj2.listAttendees(students1);

        ooj2.gradeStudent(grades1, johnDoe, 4); */
    }
}

