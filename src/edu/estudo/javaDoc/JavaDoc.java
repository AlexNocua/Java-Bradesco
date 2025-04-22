package edu.estudo.javaDoc;

/**
 * Esta classe demonstra o uso de comentários JavaDoc.
 * Faz parte do pacote de estudo sobre documentação em Java.
 * 
 * @author Alex
 * @version 1.0
 */
public class JavaDoc {

    /**
     * Método principal que inicia o programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        saudacao("Alex");
    }

    /**
     * Exibe uma mensagem de saudação personalizada.
     * 
     * @param nome Nome da pessoa a ser saudada
     */
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo ao estudo de JavaDoc.");
    }
}

// gerar documentacao
// javadoc -d doc edu/estudo/javaDoc/JavaDoc.java
