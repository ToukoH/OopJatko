package fi.utu.tech.ooj.exercise1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Tehtävä 4
        Numeroija num1 = new Numeroija();
        Numeroija num2 = new Numeroija();
        num1.numeroi(new String[]{"moi", "hei", "päivää"});
        num2.numeroi(new String[]{"kyllä", "ei","ehkä"});

        // Tehtävä 6
        System.out.println(Arrays.stream("foo  bar".split(" ")).map(m -> m.isEmpty() ? "" : ("" + m.charAt(0)).toUpperCase() + m.substring(1)).collect(Collectors.joining(" ")));

        // TODO: Tehtävä 7: käsittele seuraavat tapaukset oikein

        Tehtava7.processKeyValuePairsFromStringTaskB("pituus=paljon leveys=vähän massa=eiole");
        Tehtava7.processKeyValuePairsFromStringTaskC("eiTässäOleMitäänPareja");
    }
}