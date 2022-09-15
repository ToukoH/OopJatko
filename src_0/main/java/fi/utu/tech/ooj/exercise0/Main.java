package fi.utu.tech.ooj.exercise0;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    /**
     * Taulukot, joita voi käyttää mikäli ei teen kaikkia tehtäviä. Ohjeet tehtävänannossa.
     */
    static String[][] teht5Array = {{"1","456","6","5678","23"},{"23","22","6","2","2"},{"3","1","5","44","6"},{"55","3","8","3","2"}};

    /**
     * Tehtävä 3
     *
     * Metodi lukee syötteenä xSize*ySize kappaletta kokonaislukuja ja sijoittaa ne kokonaislukutyyppiseen
     * taulukkoon, joka palautetaan metodista.
     *
     * @param xSize Taulukon sarakemäärä
     * @param ySize Taulukon rivimäärä
     * @return xSize*ySize kokoinen kokonaislukutyyppinen taulukko, joka on täytetty kokonaisluvuilla
     */

    // TEE TÄHÄN TEHTÄVÄ 3
    public static int[] readArrayData(int xSize, int ySize) {
        int[] myArray = (int[]) Array.newInstance(int.class, xSize*ySize);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number.%n", input);
                System.out.println("Enter a new number: ");
            }
            for (int i = 0; i < xSize*ySize; i++) {
                    myArray[i] = scanner.nextInt();
                }
            break;
        }
        return myArray;
    }
    /**
     * Tehtävä 4
     *
     * Metodi tarkastaa, että argumenttina saadun taulukon kaikki alkiot ovat positiivisia. Jos jokin luku ei ole
     * positiivinen, se vaihdetaan itseisarvokseen.
     *
     * @param inputArray Kokonaislukutyyppinen taulukko
     * @return parametrinä saadun taulukon kokoinen merkkijonotyyppinen taulukko
     */

    // TEE TÄHÄN TEHTÄVÄ 4
    public static String[] checkArrayData(int[] inputArray) {
        String[] myArray = (String[]) Array.newInstance(String.class, Array.getLength(inputArray));

        for (int i = 0; i < Array.getLength(inputArray); i++) {
            inputArray[i] = Math.abs(inputArray[i]);
        }
        for (int i = 0; i < Array.getLength(myArray); i++) {
            myArray[i] = Integer.toString(inputArray[i]);
        }
        return myArray;
    }


    /**
     * Tehtävä 5
     * Metodi tulostaa argumenttina saamansa taulukon muotoillen sen taulukkomuotoon ja tasaten sarakkeet oikealle.
     *
     * @param inputArray Merkkijonotyyppinen taulukko
     * @return void
     */

    // TEE TÄHÄN TEHTÄVÄ 5
    public static void printArray(String[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        /*
          FizzBuzz-luokan runFizzBuzz()-metodilla voi tarkistaa harjoitustyöpohjan toimivuuden omassa koneessa
          ennen tehtävien tekemistä. Testin jälkeen alla olevan rivin voi joko kommentoida tai poistaa.
         */
        // FizzBuzz.runFizzBuzz();
        // Tehtävät 2-5
        // Kirjoita tähän tarvittavat metodikutsu ja muut toiminteet.
        int[] inputArray = readArrayData(2,2);
        checkArrayData(inputArray);
        printArray(teht5Array);


    }
}
