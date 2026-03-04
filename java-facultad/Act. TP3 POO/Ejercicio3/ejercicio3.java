
//Implemente un programa que indique si una palabra es un palíndromo. Una palabra es palidromo si se lee
//igual de izquierda a derecha que de derecha a izquierda.
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra " + palabra + " es  palíndromo.");
        } else {
            System.out.println("La palabra " + palabra + " no es palíndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String palabra) {
        String palabraLower = palabra.toLowerCase();
        String palabraInvertida = new StringBuilder(palabraLower).reverse().toString();
        return palabraLower.equals(palabraInvertida);
    }
}