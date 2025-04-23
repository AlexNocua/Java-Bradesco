package edu.desafios.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        // Letura das variaveis
        System.out.println("Por favor, digite o numero de conta:");
        int numero = scann.nextInt();
        System.out.println("Por favor, digite o numero de agencia:");
        String agencia = scann.next();
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scann.next();
        System.out.println("Por favor, digite o saldo:");
        double saldo = scann.nextDouble();
        // System.out.println(numero + agencia + nomeCliente + saldo);
        System.out.println(mostrarMensagem(numero, agencia, nomeCliente, saldo));
    }

    public static String mostrarMensagem(int numero, String agencia, String nomeCliente, double saldo) {
        return "\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".";
    }
}
