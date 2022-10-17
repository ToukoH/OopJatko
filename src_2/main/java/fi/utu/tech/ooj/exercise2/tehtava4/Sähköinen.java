package fi.utu.tech.ooj.exercise2.tehtava4;

public interface Sähköinen {

    void kytkeVirta();

    boolean onkoKytketty();

    void sammuta();

    /**
     * @param tehoAsetus
     */
    void säädäTeho(long tehoAsetus);

}