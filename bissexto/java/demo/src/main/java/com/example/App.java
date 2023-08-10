package com.example;

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
        System.out.println("Hello World!");
    }

    public static boolean isBissexto(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 4 == 0 && ano % 100 == 0) {
            return false;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
