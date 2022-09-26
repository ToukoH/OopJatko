package fi.utu.tech.ooj.exercise1;

import net.jqwik.api.*;
import net.jqwik.api.constraints.NotBlank;

/**
 * @.pre input != null && !input.isBlank()
 * @.post RESULT.equals(
 *          Arrays.stream(input.split(" ")).map(m -> m.isEmpty() ? "" :
 *          ("" + m.charAt(0)).toUpperCase() + m.substring(1)).collect(Collectors.joining(" "))
 *        )
 */

public class Tehtava6BTests {
    // provide non-blank strings
    @Provide
    Arbitrary<String> nonBlankStrings() {
        return Arbitraries.strings().filter(s -> !s.isBlank());
    }

    // custom jqwik annotation for generating non-blank non-null input
    // based on values filtered by 'nonBlankStrings'
    @Property
    boolean nonBlankStringIsNotBlank(@ForAll("nonBlankStrings") String s) {
        return !s.isBlank();
    }

    // built-in jqwik annotation for generating non-blank non-null input
    @Property
    boolean nonBlankStringIsNotBlank2(@ForAll @NotBlank String s) {
        return !s.isBlank();
    }

    // TODO: Tehtävä 6b: Kirjoita tähän pyydetyt ominaisuustestit

    @Property
    boolean isCapitalized(@ForAll("nonBlankStrings") String str) {
        String RESULT = Tehtava6.capitalize(str);

        return RESULT.equals(Tehtava6.capitalize2(str));
        // THE FIRST METHOD SEEMS TO BE FINE
    }

    // TODO: Tehtävä 6b: Vaihtoehtoisesti, kirjoita tähän 5 kpl ominaisuutta testaavaa yksikkötestiä
}
