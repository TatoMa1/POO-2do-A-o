//Considere lo siguiente:

//public class ArrayEntero {
//  private int[] numeros = { 4, 2, 3, 8, 1 };
//}

//Escriba métodos que devuelvan:•
//Cuantos números hay en el array números•
//Cual es el mayor.•
//Cual es el promedio•
//Los números ordenados de menor a mayor y a la inversa

import java.util.Arrays;

public class ejercicio4 {
    private int[] numeros = { 4, 2, 3, 8, 1 };

    public int cantidadNumeros() {
        return numeros.length;
    }

    public int numeroMayor() {
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double promedio() {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }

    public int[] ordenAscendente() {
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia);
        return copia;
    }

    public int[] ordenDescendente() {
        int[] copia = ordenAscendente();
        for (int i = 0; i < copia.length / 2; i++) {
            int temp = copia[i];
            copia[i] = copia[copia.length - 1 - i];
            copia[copia.length - 1 - i] = temp;
        }
        return copia;
    }

    public void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ejercicio4 array = new ejercicio4();

        System.out.println("cantidad de números: " + array.cantidadNumeros());
        System.out.println("n° mayor: " + array.numeroMayor());
        System.out.println("promedio: " + array.promedio());

        System.out.print("menor a mayor: ");
        array.imprimirArray(array.ordenAscendente());

        System.out.print("mayor a menor: ");
        array.imprimirArray(array.ordenDescendente());
    }
}
