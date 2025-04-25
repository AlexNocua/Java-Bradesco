package edu.estruturasExcepcionais;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // InputMismatchException
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // ArithmeticException
            int resultado = 10 / numero;
            System.out.println("Resultado: " + resultado);

            // NullPointerException
            String texto = null;
            System.out.println("Comprimento do texto: " + texto.length());

            // FileNotFoundException
            File arquivo = new File("arquivo_inexistente.txt");
            Scanner leitor = new Scanner(arquivo); // erro se o arquivo não existir

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Digite um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (NullPointerException e) {
            System.out.println("Erro: objeto nulo (NullPointerException).");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        } finally {
            System.out.println("Bloco 'finally' executado.");
            scanner.close();
        }

        System.out.println("Programa finalizado.");
    }
}
