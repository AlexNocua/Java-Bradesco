package edu.estudo.condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        int num_1 = 1;
        int num_2 = 2;

        // condicionais composta e simples
        if (num_1 > num_2) {
            System.out.println("O numero 1 é maior");
        } else {
            System.out.println("O numero 2 é maior");

        }

        // condicionais encadeadas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        // condicional ternaria
        int edad = 20;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);

    }

}