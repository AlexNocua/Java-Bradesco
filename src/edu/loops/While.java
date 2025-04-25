package edu.loops;

public class While {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            if (i == 5) {
                System.out.println("Continue no " + i);
                i++; // importante para evitar loop infinito
                continue;
            }

            if (i == 8) {
                System.out.println("Break no " + i);
                break;
            }

            System.out.println("Número: " + i);
            i++;
        }
    }
}
