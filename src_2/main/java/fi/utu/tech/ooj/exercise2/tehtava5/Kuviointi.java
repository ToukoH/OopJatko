package fi.utu.tech.ooj.exercise2.tehtava5;

// rajapinta, joka kuvaa sekvenssin piirrettäviä kuvioita
//
// sekvenssi = this.seuraavaKuvio()
public interface Kuviointi {
    default double koko() {
        return 50;
    }

    // seuraava kuvio tai null (= ei enää kuvioita)
    Kuvio seuraavaKuvio();
}

// generoi erivärisiä ympyröitä
class Ympyrät implements Kuviointi {
    private int i = 0;

    @Override
    public Kuvio seuraavaKuvio() {
        return new Ympyrä(koko(), PiirtoAlue.Väri.values()[i++ % PiirtoAlue.Väri.values().length]);
    }
}

// generoi erivärisiä neliöitä
class Neliöt implements Kuviointi {
    private int i = 0;

    @Override
    public Kuvio seuraavaKuvio() {
        return new Neliö(koko(), PiirtoAlue.Väri.values()[i++ % PiirtoAlue.Väri.values().length]);
    }
}