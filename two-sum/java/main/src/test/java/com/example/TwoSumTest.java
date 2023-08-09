package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void test_deve_somar_numeros_em_vetor_e_comparar_com_target_e_retornar_posicao() {
        Integer[] vecExpected;
        Integer[] vecActual;

        assertArrayEquals(
                vecExpected = new Integer[] { 0, 1 },
                vecActual = new TwoSum().getSum(new Integer[] { 2, 7, 11, 15 }, 9),
                "Because nums[0] + nums[1] == 9, we return [0, 1].");
        assertArrayEquals(
                vecExpected = new Integer[] { 1, 2 },
                vecActual = new TwoSum().getSum(new Integer[] { 3, 2, 4 }, 6));
        assertArrayEquals(
                vecExpected = new Integer[] { 0, 1 },
                vecActual = new TwoSum().getSum(new Integer[] { 3, 3 }, 6));

    }
}
