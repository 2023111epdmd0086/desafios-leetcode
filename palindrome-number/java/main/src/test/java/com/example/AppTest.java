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
    void retorna_true_se_for_palindromo() {
        assertEquals(true, App.isPalindrome(121), "121 reads as 121 from left to right and from right to left.");
        assertEquals(false, App.isPalindrome(-121), "From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.");
        assertEquals(false, App.isPalindrome(10), "Reads 01 from right to left. Therefore it is not a palindrome.");
    }
}
