package fi.utu.tech.ooj.exercise2.tehtava5;

// rajapinta, joka kuvaa sekvenssin koordinaattipisteitä
// piirrettäville kuvioille
//
// sekvenssi = this.seuraavaPaikka()
public interface Asettelu {
    default double koko() {
        return 50;
    }

    // seuraava piste tai null (= asettelu päättyy)
    Piste seuraavaPiste();
}

// latoo x-suuntaan jonoon kuviot
class Jono implements Asettelu {
    private Piste nyt = new Piste(50, 250);

    @Override
    public Piste seuraavaPiste() {
        return nyt = new Piste(nyt.x + koko(), nyt.y);
    }
}


// latoo x-suuntaan jonoon kuviot siksak-muotoon
class Siksak implements Asettelu {
    private boolean sik = true;
    private Piste nyt = new Piste(50, 250);

    @Override
    public Piste seuraavaPiste() {
        return nyt = new Piste(nyt.x + koko(), nyt.y + koko() / 2 * ((sik = !sik) ? 1 : -1));
    }
}