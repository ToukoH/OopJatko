package fi.utu.tech.ooj.exercise2.tehtava5;

// rajapinta piirtämiseen
// määrittää värin ja piirtokäskyt
public interface PiirtoAlue {
    // piirtämisen perusvärit
    // voidaan toteuttaa eri tavoin eri piirtoalueille
    enum Väri {
        Sininen, Punainen, Vihreä, Oranssi
    }

    // piirtää 2*koko-levyisen neliön pisteen ympärille värillä väri
    void piirräNeliö(Piste piste, double koko, Väri väri);

    // piirtää koko-kokoisen kolmion pisteen ympärille värillä väri
    void piirräKolmio(Piste piste, double koko, Väri väri);

    // piirtää koko-säteisen ympyrän pisteen ympärille värillä väri
    void piirräYmpyrä(Piste piste, double koko, Väri väri);
}

// piirtoalueen simulaatio -- tulostaa terminaaliin, mitä piirrettäisiin
// jos pystyttäisiin oikeasti piirtämään jotain
class Terminaali implements PiirtoAlue {
    @Override
    public void piirräNeliö(Piste piste, double koko, Väri väri) {
        System.out.println("Piirretään " + 2 * koko + "-levyinen neliö pisteen " + piste + " ympärille värillä " + väri);
    }

    @Override
    public void piirräKolmio(Piste piste, double koko, Väri väri) {
        System.out.println("Piirretään " + koko + "-kokoinen kolmio pisteen " + piste + " ympärille värillä " + väri);
    }

    @Override
    public void piirräYmpyrä(Piste piste, double koko, Väri väri) {
        System.out.println("Piirretään " + koko + "-säteinen ympyrä pisteen " + piste + " ympärille värillä " + väri);
    }
}
