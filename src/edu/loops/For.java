package edu.loops;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // iteracao em um array
        String[] frutas = { "Maçã", "Banana", "Laranja", "Uva" };

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: " + frutas[i]);
        }

        // foreach
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // continue e break
        for (int i = 1; i <= 10; i++) {
            // pula o número 5
            if (i == 5) {
                System.out.println("Continue no " + i);
                continue;
            }

            // para o loop no número 8
            if (i == 8) {
                System.out.println("Break no " + i);
                break;
            }

            System.out.println("Número: " + i);
        }
    }
}
