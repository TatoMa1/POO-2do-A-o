package pila;

public class PruebaApp {

    public static void main(String[] args) {

        // En un método main:
        PilaDeObjects pilaMixta = new PilaDeObjects();

        // Podemos agregar cualquier cosa, ¡lo cual ya es un problema de diseño!
        pilaMixta.push(10); // Un Integer
        pilaMixta.push("Hola Mundo"); // Un String
        // pilaMixta.push(25.5); // Un Double

        System.out.println("Sacando elementos de la pila de Objects:");

        // 1. PELIGRO: Necesitamos hacer un "casting" explícito.
        String texto = (String) pilaMixta.pop(); // Sacamos "Hola Mundo", OK. Pero, ¿y si nos equivocamos?
        System.out.println("Elemento sacado: " + texto);

        // 2. ¡ERROR EN TIEMPO DE EJECUCIÓN!
        // El programador esperaba un String, pero el siguiente elemento es un Integer
        // (10).
        // Esto compila sin problemas, pero fallará catastróficamente al ejecutarse.
        // String otroTexto = (String) pilaMixta.pop(); // ¡Lanzará ClassCastException!

    }

}