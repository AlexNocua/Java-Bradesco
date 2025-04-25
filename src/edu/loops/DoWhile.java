package edu.loops;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 5) {
                System.out.println("Continue no " + i);
                i++; // evitar loop infinito
                continue;
            }

            if (i == 8) {
                System.out.println("Break no " + i);
                break;
            }

            System.out.println("Número: " + i);
            i++;
        } while (i <= 10);
    }
}
