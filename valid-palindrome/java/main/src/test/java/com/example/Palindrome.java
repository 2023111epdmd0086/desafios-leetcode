package com.example;

public class Palindrome {
    public Palindrome() {
    }

    public static boolean isPalindrome(String s) {
        StringBuilder palindromo = new StringBuilder(s);
        palindromo = palindromo.reverse();
        String palindromoString = palindromo.toString();

        String substituirChar = " \"@#_`-;!()?/:.,[]{}'\\";

        for (int i = 0; i < substituirChar.length(); i++) {
            s = s.replace(String.valueOf(substituirChar.charAt(i)), "").toLowerCase();
            palindromoString = palindromoString.replace(String.valueOf(substituirChar.charAt(i)), "").toLowerCase();
        }
        if (s.equals(palindromoString)) {
            return true;
        } else {
            return false;
        }
    }
}
