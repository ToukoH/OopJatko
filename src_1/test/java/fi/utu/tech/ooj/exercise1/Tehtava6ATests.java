package fi.utu.tech.ooj.exercise1;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

public class Tehtava6ATests {
    // provide small integers
    @Provide
    Arbitrary<Integer> smallIntegers() {
        return Arbitraries.integers().between(-9999,9999);
    }

    // provide arrays of small integers
    @Provide
    Arbitrary<int[]> smallIntegerArrays() {
        return Arbitraries.integers().between(-9999,9999).array(int[].class);
    }

    @Property
    boolean smallIntegersAreSmall(@ForAll("smallIntegers") int i) {
        return Math.abs(i) < 10000;
    }

    @Property
    boolean smallIntegersAreSmall(@ForAll("smallIntegerArrays") int[] is) {
        for(int i: is)
            if (Math.abs(i) >= 10000) return false;

        return true;
    }
    // TODO: Tehtävä 6a: Kirjoita tähän pyydetyt ominaisuustestit
    @Property
    boolean sameLength(@IntRange(min = -9999, max = 9999) @ForAll int[] arr) {
        int[] RESULT = Tehtava6.sqr(arr);
        return RESULT.length == arr.length;
    }

    @Property
    boolean isAllValuesPositive(@IntRange(min = -9999, max = 9999) @ForAll int[] arr) {
        int[] RESULT = Tehtava6.sqr(arr);
        return java.util.stream.IntStream.range(0, RESULT.length).allMatch(i -> Math.abs(i) == i);
    }

    @Property
    boolean isSquared(@IntRange(min = -9999, max = 9999) @ForAll int[] arr) {
        int[] RESULT = Tehtava6.sqr(arr);
        return java.util.stream.IntStream.range(0, RESULT.length).allMatch(i -> arr[i] * arr[i] == RESULT[i]);
    }
    // TODO: Tehtävä 6a: Vaihtoehtoisesti, kirjoita tähän 5 kpl ominaisuutta testaavaa yksikkötestiä

}
