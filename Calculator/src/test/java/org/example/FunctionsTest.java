package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionsTest {

    @Test
    void add1() {
        Assertions.assertEquals(0, Functions.add(0, 0));
    }

    @Test
    void add2() {
        Assertions.assertEquals(5, Functions.add(5, 0));
    }

    @Test
    void add3() {
        Assertions.assertEquals(8, Functions.add(5, 3));
    }

    @Test
    void twice1() {
        Assertions.assertEquals(6, Functions.twice(3));
    }

    @Test
    void twice2() {
        Assertions.assertEquals(6, Functions.twice(-3));
    }
}