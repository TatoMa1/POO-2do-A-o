//1. Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros dos,
// en otro caso calcule la suma.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int num2 = scanner.nextInt();
        System.out.println("ingrese un numero");
        int num3 = scanner.nextInt();

        int resultado;
        if (num1 > 0) {
            resultado = num2 * num3;
        } else {
            resultado = num2 + num3;
        }
        System.out.println("el resultado es" + resultado);
        scanner.close();
    }
}