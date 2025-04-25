package edu.estruturasExcepcionais;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HierarquiaDasExcepcoes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            // 1. Exceção NÃO VERIFICADA (Unchecked) → RuntimeException
            System.out.println("Exemplo de NullPointerException:");
            String texto = null;
            System.out.println(texto.length()); // NullPointerException

            // 2. Exceção VERIFICADA (Checked) → precisa ser tratada ou declarada com throws
            System.out.println("Exemplo de IOException:");
            throw new IOException("Erro de I/O simulado");

            // 3. Outro exemplo VERIFICADO
            System.out.println("Exemplo de FileNotFoundException:");
            File arquivo = new File("arquivo_inexistente.txt");
            java.util.Scanner scanner = new java.util.Scanner(arquivo); // FileNotFoundException

        } catch (NullPointerException e) {
            System.out.println("❗ Pegou NullPointerException (herda de RuntimeException)");
        } catch (FileNotFoundException e) {
            System.out.println("❗ Pegou FileNotFoundException (herda de IOException)");
        } catch (IOException e) {
            System.out.println("❗ Pegou IOException (Checked Exception)");
        } catch (Exception e) {
            System.out.println("❗ Pegou Exception genérica (pai de quase todas)");
        } finally {
            System.out.println("✅ Bloco finally sempre é executado (mesmo com erro).");
        }

        System.out.println("🔚 Fim do programa.");
    }

}
// ✅ Exemplo completo: Criando e usando uma exceção checada personalizada
// 🔧 1. Crie a exceção personalizada
// java
// Copiar
// Editar
// // Exceção personalizada checada
// public class MinhaExcecaoChecada extends Exception {
//     public MinhaExcecaoChecada(String mensagem) {
//         super(mensagem);
//     }
// }
// 🧪 2. Use a exceção personalizada
// java
// Copiar
// Editar
// public class TesteExcecaoPersonalizada {
    
//     // Método que lança a exceção personalizada
//     public static void verificarIdade(int idade) throws MinhaExcecaoChecada {
//         if (idade < 18) {
//             throw new MinhaExcecaoChecada("Idade insuficiente para realizar o cadastro.");
//         } else {
//             System.out.println("Idade válida: " + idade);
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             verificarIdade(16); // vai lançar a exceção
//         } catch (MinhaExcecaoChecada e) {
//             System.out.println("Erro capturado: " + e.getMessage());
//         }

//         System.out.println("Programa continua normalmente...");
//     }
// }
