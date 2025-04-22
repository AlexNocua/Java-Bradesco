package edu.estudo.operadores;

public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // matematicos
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b)); // División entera
        System.out.println("Módulo: " + (a % b)); // Resto de la división

        // relacionales
        System.out.println("¿a == b? " + (a == b));
        System.out.println("¿a != b? " + (a != b));
        System.out.println("¿a > b? " + (a > b));
        System.out.println("¿a < b? " + (a < b));
        System.out.println("¿a >= b? " + (a >= b));
        System.out.println("¿a <= b? " + (a <= b));

        // adicion
        int c = 5;
        c += 3; // c = c + 3;
        System.out.println("c += 3: " + c);

        c -= 2; // c = c - 2;
        System.out.println("c -= 2: " + c);

        c *= 4; // c = c * 4;
        System.out.println("c *= 4: " + c);

        c /= 2; // c = c / 2;
        System.out.println("c /= 2: " + c);

        c %= 3; // c = c % 3;
        System.out.println("c %= 3: " + c);

        int d = 7;
        System.out.println("d original: " + d);

        System.out.println("d++: " + d++); // primero muestra, luego suma
        System.out.println("Después de d++: " + d);

        System.out.println("++d: " + ++d); // primero suma, luego muestra

        // operadores ternarios
        int numero = -5;
        String mensaje = (numero >= 0) ? "Positivo" : "Negativo";
        System.out.println("El número es: " + mensaje);

        // operadores logicos
        boolean verdadeiro = true;
        boolean falso = false;

        // AND lógico
        System.out.println("a && b: " + (verdadeiro && falso)); // false

        // OR lógico
        System.out.println("a || b: " + (verdadeiro || falso)); // true

        // NOT lógico
        System.out.println("!a: " + (!verdadeiro)); // false
        System.out.println("!b: " + (!falso)); // true

        // Ejemplo práctico con condiciones
        int edad = 20;
        boolean tieneDocumento = true;

        if (edad >= 18 && tieneDocumento) {
            System.out.println("Puede entrar al evento.");
        } else {
            System.out.println("No puede entrar al evento.");
        }

        // Otro ejemplo con OR
        boolean esEstudiante = true;
        boolean tieneDescuento = false;

        if (esEstudiante || tieneDescuento) {
            System.out.println("Aplica para precio especial.");
        } else {
            System.out.println("Debe pagar precio completo.");
        }
    }

}
