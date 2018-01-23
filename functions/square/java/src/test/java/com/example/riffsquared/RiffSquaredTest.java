package com.example.riffsquared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RiffSquaredTest {
    private RiffSquared app = new RiffSquared();

    @Test
    void squareOf2Is4() {
        assertEquals(app.apply(2.0), "2.0 squared is 4.0\n");
    }

    @Test
    void squareOf5Is25() {
        assertEquals(app.apply(5.0), "5.0 squared is 25.0\n");
    }

    @Test
    void squareOf2IsNot5() {
        assertNotEquals(app.apply(2.0), "2.0 squared is 5.0\n");
    }
}