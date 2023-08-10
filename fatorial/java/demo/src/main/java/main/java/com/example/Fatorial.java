package main.java.com.example;

public class Fatorial {
    public static int isFatorial(int f) {
        for (int i = f-1; i>0; i--) {
            f = f*i;
        }
        return f;
    }
}
