package com.example.riffhello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RiffHelloTest {
    private RiffHello app = new RiffHello();

    @Test
    void helloHan() {
        assertEquals(app.apply("Han"), "Hello Han\n");
    }

    @Test
    void helloChewie() {
        assertNotEquals(app.apply("Han"), "Hello Chewie\n");
    }

    @Test
    void helloNewLine() {
        assertNotEquals(app.apply("Han"), "Hello Han");
    }
}