package edu.estudo.condicionais;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        System.out.print("Digite um número (1 a 3): ");
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            default:
                System.out.println("Dia inválido");
                scanner.close();

        }

    }
}
