package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testDeveRetornarTrueSeAnoForBissexto() {
        assertEquals(true, App.isBissexto(2024));
        assertEquals(false, App.isBissexto(1900));
        assertEquals(true, App.isBissexto(4));
        assertEquals(false, App.isBissexto(1));
    }
}

