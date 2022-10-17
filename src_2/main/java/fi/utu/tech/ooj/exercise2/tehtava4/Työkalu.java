package fi.utu.tech.ooj.exercise2.tehtava4;

public interface Työkalu {

    default void huolla() {}

    /**
     * @param parameter
     */
    default boolean testaaSoveltuvuusMetallille(Metallit parameter) { return false; }

}