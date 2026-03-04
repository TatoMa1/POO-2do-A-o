package Ejercicio5;

public class DelEjercicio5 {
        public static void main(String[] args) {
                Ejercicio5 e = new Ejercicio5(6);

                e.setNumero(10);
                System.out.println("Número: " + e.getNumero());
                System.out.println("Cuadrado: " + e.cuadrado());
                System.out.println("Par o impar: " + e.parOimpar());
                System.out.println("Factorial: " + e.factorial());
                System.out.println("¿Es primo?: " + (e.esPrimo() ? "Sí" : "No"));
        }
}
