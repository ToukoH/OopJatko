package fi.utu.tech.ooj.exercise1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tehtava6 {
    /**
     * Laskee annetun kokonaislukutaulukon jokaisen luvun neliön
     * (luku kerrotaan itsellään) ja palauttaa alkuperäisen kokoisen
     * uuden taulukon, jossa kullekin alkuperäistä lukua vastaavalle
     * paikalle on sijoitettu tämä laskettu luvun neliö.
     *
     * Huom! Toimii vain pienillä luvuilla, koska neliöinti aiheuttaa
     * melko äkkiä kokonaislukuarvon ylivuodon.
     *
     * @.pre input != null && FORALL(x: input; x > -10000 && x < 10000)
     * @.post RESULT.length == input.length &&
     *        FORALL(x: RESULT; x >= 0) &&
     *        FORALL(0 <= i < RESULT.length; RESULT[i] == input[i] * input[i])
     */
    public static int[] sqr(int[] input) {
        int[] tmp = new int[input.length];
        for (int i = 0; i < input.length; i++)
            tmp[i] = input[i] * input[i];
        return tmp;
    }

    /**
     * Rutiini, joka käy läpi annetun merkkijonon sana kerrallaan
     * ja suurentaa jokaisen sanan ensimmäisen kirjaimen isoksi
     * kirjaimeksi, jos muunnokselle on tarvetta. Voidaan käyttää
     * esim. otsikoiden kirjainasun korjaamiseen.
     * <p>
     * Esim.
     * syöte: "terve maailma"
     * tulos: "Terve Maailma"
     *
     * @.pre input != null && !input.isBlank()
     * @.post RESULT.equals(
     *          Arrays.stream(input.split(" ")).map(m -> m.isEmpty() ? "" : ("" + Character.toUpperCase(m.charAt(0))) + m.substring(1)).collect(Collectors.joining(" "))
     *        )
     */
    public static String capitalize(String input) {
        StringBuffer buffer = new StringBuffer();

        boolean upper = true;
        for (char c : input.toCharArray()) {
            if (upper)
                buffer.append(Character.toUpperCase(c));
            else
                buffer.append(c);
            upper = c == ' ';
        }
        return buffer.toString();
    }

    /**
     * Vastaava funktion toinen versio, jolla voi vakuuttua, että
     * loppuehdon koodikin tuottaa merkkijonoja.
     */
    public static String capitalize2(String input) {
        return Arrays.stream(input.split(" ")).map(m -> m.isEmpty() ? "" : ("" + Character.toUpperCase(m.charAt(0))) + m.substring(1)).collect(Collectors.joining(" "));
    }
}
