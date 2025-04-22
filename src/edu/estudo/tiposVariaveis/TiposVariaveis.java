package edu.estudo.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // tipp de variaveis
        // String name = 'alex'
        // int, boolean, String, double, long, short, byte, float

        // a estrutura è tipo nome e atribuicao
        // exemplos
   // Declaración de variables de distintos tipos
   int numeroInt = 42;
   boolean estado = true;
   String texto = "Resultado:";
   double numeroDouble = 3.14159;
   long numeroLong = 100000L;
   short numeroShort = 1200;
   byte numeroByte = 100;
   float numeroFloat = 2.5f;

   // Concatenación de variables
   String mensaje = texto + " " + numeroInt + ", estado: " + estado;
   System.out.println(mensaje);

   // Conversión de tipos (casting)
   double convertidoADouble = numeroInt; // int → double (implícito)
   int convertidoAInt = (int) numeroDouble; // double → int (explícito)
   short convertidoAShort = (short) numeroInt; // int → short (explícito)
   byte convertidoAByte = (byte) numeroShort; // short → byte (explícito)
   int floatAInt = (int) numeroFloat; // float → int (explícito)

   // Mostrar resultados de las conversiones
   System.out.println("int → double: " + convertidoADouble);
   System.out.println("double → int: " + convertidoAInt);
   System.out.println("int → short: " + convertidoAShort);
   System.out.println("short → byte: " + convertidoAByte);
   System.out.println("float → int: " + floatAInt);
   
   // Convertir de numérico a String
   String numeroComoTexto = String.valueOf(numeroDouble);
   System.out.println("Double como texto: " + numeroComoTexto);

    }
}
