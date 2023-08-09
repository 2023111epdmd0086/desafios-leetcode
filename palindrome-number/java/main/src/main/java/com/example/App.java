package com.example;

import java.util.Scanner;
import java.util.Locale;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        boolean palindrome = isPalindrome(numero);

        if (palindrome) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Nao é palindromo");
        }

        sc.close();
    }

    static boolean isPalindrome(int numero) {
        String numeroString = Integer.toString(numero);
        StringBuilder palindromo = new StringBuilder(numeroString);

        if(numeroString.equals(palindromo.reverse().toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}
