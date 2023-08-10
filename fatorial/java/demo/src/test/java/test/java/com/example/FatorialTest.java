package test.java.com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.example.Fatorial;


public class FatorialTest {
    @Test
    void retornaSeForFatorial(){

        int actual = Fatorial.isFatorial(5);
        final int expected = 120;
        assertEquals(expected, actual);
    }
}
