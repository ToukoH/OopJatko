package fi.utu.tech.ooj.exercise2.tehtava5;

// luokkahierarkia, joka määrittää piirrettäviä kuvioita
// piirto = this.piirrä(...)
//
// määritelty valmiiksi kolme peruskuviota:
// neliö, kolmio, ympyrä
public abstract class Kuvio {
    final double koko;
    final PiirtoAlue.Väri väri;

    public Kuvio(double koko, PiirtoAlue.Väri väri) {
        this.koko = koko;
        this.väri = väri;
    }

    abstract void piirrä(Piste paikka, PiirtoAlue piirtoAlue);
}

class Neliö extends Kuvio {
    public Neliö(double koko, PiirtoAlue.Väri väri) {
        super(koko, väri);
    }

    @Override
    void piirrä(Piste paikka, PiirtoAlue piirtoAlue) {
        piirtoAlue.piirräNeliö(paikka, koko, väri);
    }
}

class Kolmio extends Kuvio {
    public Kolmio(double koko, PiirtoAlue.Väri väri) {
        super(koko, väri);
    }

    @Override
    void piirrä(Piste paikka, PiirtoAlue piirtoAlue) {
        piirtoAlue.piirräKolmio(paikka, koko, väri);
    }
}

class Ympyrä extends Kuvio {
    public Ympyrä(double koko, PiirtoAlue.Väri väri) {
        super(koko, väri);
    }

    @Override
    void piirrä(Piste paikka, PiirtoAlue piirtoAlue) {
        piirtoAlue.piirräYmpyrä(paikka, koko, väri);
    }
}