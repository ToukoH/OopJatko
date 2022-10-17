package fi.utu.tech.ooj.exercise2.tehtava4;

public class Pora extends TyökaluBase {
    String merkki;
    String tyyppi;

    public Pora(String merkki, String tyyppi) {
        this.merkki = merkki;
        this.tyyppi = tyyppi;
        System.out.println("Luotu " + this);
    }
}