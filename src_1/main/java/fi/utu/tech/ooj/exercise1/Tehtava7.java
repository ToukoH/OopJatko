package fi.utu.tech.ooj.exercise1;

import java.util.*;

public class Tehtava7 {

    // TODO: 7a

    // Scanner scanner = new Scanner(input).useDelimiter("\\s+|=");
    // Can throw IOException if an I/O error occurs opening the source

    // while (scanner.hasNext())
    // Can throw IllegalStateException if this scanner is closed

    // String key = scanner.next(); and/or String tempValue = scanner.next();
    // Can throw NoSuchElementException if no more tokens are available or
    // IllegalStateException if this scanner is closed

    // Integer value = Integer.valueOf(tempValue);
    // Can throw NumberFormatException if the input is invalid type or in this case other than integer

    // TODO: Toteuta tehtävän 7b poikkeuskäsittely tähän metodiin
    public static Map<String, Integer> processKeyValuePairsFromStringTaskB(String input) {
        Scanner scanner = new Scanner(input).useDelimiter("\\s+|=");
        Map<String, Integer> output = new HashMap<>();

        while (scanner.hasNext()) {
            String key = scanner.next();
            String tempValue = scanner.next();
            try {
                Integer value = Integer.valueOf(tempValue);
                output.put(key, value);
            } catch (NumberFormatException exception) {
                System.out.println("integers only please");
            }
        }

        scanner.close();

        return !output.isEmpty() ? output : Map.of();
    }

    public static boolean isInt(String str) {

        try {
            @SuppressWarnings("unused")
            int x = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    // TODO: Toteuta tehtävän 7c poikkeuskäsittely tämän metodin yhteyteen
    public static Map<String, Integer> processKeyValuePairsFromStringTaskC(String input) {
        Scanner scanner = new Scanner(input);
        try {
            scanner.useDelimiter("\\s+|=");
        } catch (NoSuchElementException exception) {
            System.out.println("Integers only please");
        }
        Map<String, Integer> output = new HashMap<>();

        while (scanner.hasNext()) {
            String key = scanner.next();
            String tempValue = scanner.next();
            if (!isInt(tempValue)) {
                throw new IllegalArgumentException
                        ("Integers only please");
            }
            Integer value = Integer.valueOf(tempValue);
            output.put(key, value);
         }

        scanner.close();
        return output;
    }
}
