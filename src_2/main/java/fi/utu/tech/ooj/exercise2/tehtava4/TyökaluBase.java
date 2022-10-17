package fi.utu.tech.ooj.exercise2.tehtava4;

import java.util.ArrayList;

abstract class TyökaluBase implements Työkalu {
    protected int idNumero;
    protected String merkki;
    protected String tyyppi;
    protected ArrayList<Metallit> soveltuvuusMetallille;

    @Override
    public String toString() {
        return String.format("Luokka: %s Merkki: %s Tyyppi: %s", getClass().getCanonicalName(), merkki, tyyppi);
    }
}