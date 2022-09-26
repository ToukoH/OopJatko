package fi.utu.tech.ooj.exercise0;

import net.jqwik.api.*;

public class FizzBuzzTests {

    // provide numbers 3, 6, 9, ... for the test
    // touch
    @Provide
    Arbitrary<Integer> divisibleBy3() {
        return Arbitraries.integers().between(1, 100).filter(i -> i % 3 == 0);
    }

    @Property
    boolean every_third_element_starts_with_Fizz(@ForAll("divisibleBy3") int i) {
        return FizzBuzz.fizzBuzz().get(i - 1).startsWith("Fizz");
    }
}
