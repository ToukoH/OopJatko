package fi.utu.tech.ooj.exercise1;

class Numeroija {
    int laskuri = 1;
    // REMOVED STATIC KEYWORD
    // Static keyword is used to generalize a variable(attribute) among different instances of a class.
    // This allows more efficient memory usage.
    // By removing this keyword laskuri-attribute becomes independent for different instances of this class.

    void numeroi(String[] rivit) {
        for (var rivi : rivit) {
            System.out.println(laskuri++ + " " + rivi);
        }
    }
}
public class Tehtava4 {
    /**
     * Palauttaa taulukon, jonka kukin alkio sisältää ko. alkion ja kaikkien
     * sitä syötetaulukossa edeltävien alkioiden summan.
     *
     * Toisin sanoen tulostaulukon arvot ovat
     * [arr[0], arr[0] + arr[1], arr[0] + arr[1] + arr[2], ...]
     */
    public static int[] cumulativeSums(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            // OLD METHOD
            // The method sums only the current and previous index
            // Also, the method starts indexing from 1, so the first number is not taken in count
            // arr[i] = arr[i-1] + arr[i];
            // NEW METHOD
            // We need to create an auxiliary variable to keep count of the current sum
            total += arr[i];
            arr[i] = total;
        }
        return arr;
    }
}
