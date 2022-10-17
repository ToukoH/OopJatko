package fi.utu.tech.ooj.exercise2.tehtava5;

// luokka, joka kuvaa piirrettävän piirroksen "reseptin"
public interface Piirros {
    void piirrä(PiirtoAlue piirtoAlue);
}

class Piirros1 implements Piirros {
    private Asettelu asettelu;
    private Kuviointi kuviointi;

    public Piirros1(Asettelu asettelu, Kuviointi kuviointi) {
        this.asettelu = asettelu;
        this.kuviointi = kuviointi;
    }

    // odottaa sekunnin
    static void tauko() {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {}
    }

    public void piirrä(PiirtoAlue piirtoAlue) {
        int iteraatioita = 8;
        while (iteraatioita-- > 0) {
            var kuvio = kuviointi.seuraavaKuvio();
            var piste = asettelu.seuraavaPiste();
            if (kuvio == null || piste == null) return;
            kuvio.piirrä(piste, piirtoAlue);
        }
    }

    public static Piirros rakenna() {
        return new Piirros1(new Siksak(), new Neliöt());
    }
}

class Piirros2 extends Siksak implements Piirros {
    private Kuviointi kuviointi;

    public Piirros2(Kuviointi kuviointi) {
        this.kuviointi = kuviointi;
    }

    @Override
    public Piste seuraavaPiste() {
        System.out.println("Määritetään seuraava piste!");
        return super.seuraavaPiste();
    }

    public void piirrä(PiirtoAlue piirtoAlue) {
        int iteraatioita = 8;
        while (iteraatioita-- > 0) {
            var kuvio = kuviointi.seuraavaKuvio();
            var piste = seuraavaPiste();
            if (kuvio == null || piste == null) return;
            kuvio.piirrä(piste, piirtoAlue);
        }
    }

    public static Piirros rakenna() {
        return new Piirros2(new Neliöt());
    }
}

class Piirros3 extends Siksak implements Piirros {
    private boolean viimeksiKuvioMääritys;
    Kuviointi kuviointi = new Neliöt() {
        @Override
        public Kuvio seuraavaKuvio() {
            if (viimeksiKuvioMääritys) {
                System.out.println("Mahdollinen virhe - määritettiin kuvio kahdesti peräkkäin!");
            }
            viimeksiKuvioMääritys = true;
            return super.seuraavaKuvio();
        }
    };

    @Override
    public Piste seuraavaPiste() {
        if (!viimeksiKuvioMääritys) {
            System.out.println("Mahdollinen virhe - määritettiin piste kahdesti peräkkäin!");
        }
        viimeksiKuvioMääritys = false;
        return super.seuraavaPiste();
    }

    public void piirrä(PiirtoAlue piirtoAlue) {
        int iteraatioita = 8;
        while (iteraatioita-- > 0) {
            var kuvio = kuviointi.seuraavaKuvio();
            var piste = seuraavaPiste();
            if (kuvio == null || piste == null) return;
            kuvio.piirrä(piste, piirtoAlue);
        }
    }

    public static Piirros rakenna() {
        return new Piirros3();
    }
}