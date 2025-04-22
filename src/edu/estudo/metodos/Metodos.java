package edu.estudo.metodos;

// cuando se coloca el void cuando el metodo no retorna nada
// el metodo static pertenece a una clase y no a un objeto, tener en cuenta
// sin el metodo static se tiene que crear un objeto para utilizarlo
public class Metodos {

    // Método simple (sin parámetros, sin retorno)
    public static void saludar() {
        System.out.println("¡Hola, bienvenido!");
    }

    // Método con parámetros
    public static void saludarPersona(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // Método con retorno
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método no static (requiere una instancia)
    public void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // Sobrecarga de métodos (mismo nombre, distintos parámetros)
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamadas a métodos static
        saludar();
        saludarPersona("Alex");

        int resultado = sumar(5, 7);
        System.out.println("Suma (int): " + resultado);

        double resultadoDouble = sumar(3.5, 2.8);
        System.out.println("Suma (double): " + resultadoDouble);

        // // Llamada a método no estático
        // EjemploMetodos obj = new EjemploMetodos();
        // obj.mostrarMensaje("Este es un método no estático.");
    }
}
