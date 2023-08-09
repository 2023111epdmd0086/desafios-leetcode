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
    void test_deve_retornar_se_for_palindromo() {
        assertEquals(true, Palindrome.isPalindrome("A man, a plan, a canal: Panama"),
                "'amanaplanacanalpanama' is a palindrome");
        assertEquals(false, Palindrome.isPalindrome("race a car"), "'amanaplanacanalpanama' is a palindrome");
        assertEquals(true, Palindrome.isPalindrome(" "), "'amanaplanacanalpanama' is a palindrome");
        assertEquals(true, Palindrome.isPalindrome("ab@a"));
        assertEquals(true, Palindrome.isPalindrome("c#dc"));
        assertEquals(true, Palindrome.isPalindrome("ab_a"));
        assertEquals(true, Palindrome.isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
        assertEquals(true, Palindrome.isPalindrome("A man, a plan, a canal -- Panama"));
        assertEquals(true, Palindrome.isPalindrome("Live on evasions? No, I save no evil."));
        assertEquals(true, Palindrome.isPalindrome("I, man, am regal; a German am I."));
        assertEquals(true, Palindrome.isPalindrome("`l;`` 1o1 ??;l`"));
        assertEquals(true, Palindrome.isPalindrome("Egad! Loretta has Adams as mad as a hatter. Old age!"));
    }
}
