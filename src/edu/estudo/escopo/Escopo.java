package edu.estudo.escopo;

// ter em conta que se uam variavel è declarada dentro de um metodo a variavel so vai funcionar dentro do bloco

public class Escopo {
    // Variável de instância (escopo da classe)
    int variavelDeClasse = 10;

    public void metodoExemplo() {
        // Variável local (escopo do método)
        int variavelLocal = 5;

        if (variavelLocal > 0) {
            // Variável de bloco (escopo do if)
            int variavelDeBloco = 20;
            System.out.println("Dentro do bloco: " + variavelDeBloco);
        }

        // Aqui, ainda podemos acessar variavelLocal e variavelDeClasse
        System.out.println("Dentro do método: " + variavelLocal);
        System.out.println("Variável de instância: " + variavelDeClasse);

        // variavelDeBloco não está mais acessível aqui:
        // System.out.println(variavelDeBloco); // Isso causaria um erro de compilação
    }

    public static void main(String[] args) {
        Escopo exemplo = new Escopo();
        exemplo.metodoExemplo();

        // Aqui, não conseguimos acessar nem variavelLocal nem variavelDeBloco
        // System.out.println(variavelLocal); // Erro
    }
}
