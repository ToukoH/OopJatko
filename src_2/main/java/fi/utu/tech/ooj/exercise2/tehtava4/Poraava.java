package fi.utu.tech.ooj.exercise2.tehtava4;

public interface Poraava extends Työkalu {

    /**
     * @param xKoordinaatti
     * @param yKoordinaatti
     */
    void poraa(int xKoordinaatti, int yKoordinaatti);

    /**
     * @param koko
     */
    void vaihdaTerä(int koko);

}