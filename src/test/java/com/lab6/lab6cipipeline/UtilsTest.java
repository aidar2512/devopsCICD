package com.lab6.lab6cipipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private final Utils utils = new Utils();

    @Test
    void testIsEven() {
        assertTrue(utils.isEven(2));
        assertFalse(utils.isEven(3));
        assertTrue(utils.isEven(0));
    }

    @Test
    void testIsPositive() {
        assertTrue(utils.isPositive(5));
        assertFalse(utils.isPositive(-5));
        assertFalse(utils.isPositive(0));
    }
}
