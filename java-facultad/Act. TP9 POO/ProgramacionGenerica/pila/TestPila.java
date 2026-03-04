package pila;

// ...existing code...
public class TestPila {
    public static void main(String[] args) {
        // --- Ejemplo 1: Una pila de Números Enteros ---
        System.out.println("--- Pila de Integers ---");
        Pila<Integer> pilaDeNumeros = new Pila<>();

        // El compilador SOLO nos permite agregar Integers.
        pilaDeNumeros.push(100);
        pilaDeNumeros.push(200);
        pilaDeNumeros.push(300);

        // ¡ERROR DE COMPILACIÓN! El compilador nos protege.
        // Pide a los alumnos que descomenten la línea para ver el error.
        // pilaDeNumeros.push("Esto no es un número");

        System.out.println("El elemento en la cima es: " + pilaDeNumeros.peek()); // Devuelve 300

        while (!pilaDeNumeros.isEmpty()) {
            // No necesitamos hacer casting. pop() devuelve un Integer directamente.
            Integer numero = pilaDeNumeros.pop();
            System.out.println("Sacando: " + numero);
        }

        System.out.println("\n--- Pila de Strings ---");
        // --- Ejemplo 2: Una pila de Cadenas de Texto ---
        // La misma clase Pila, pero ahora para Strings. ¡Reutilización total!
        Pila<String> pilaDeTextos = new Pila<>();

        pilaDeTextos.push("Java");
        pilaDeTextos.push("es");
        pilaDeTextos.push("genial");

        while (!pilaDeTextos.isEmpty()) {
            // pop() ahora devuelve un String. ¡Sin casting, sin peligro!
            String palabra = pilaDeTextos.pop();
            System.out.println("Sacando: " + palabra);
        }
    }
}