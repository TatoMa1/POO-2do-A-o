package concurrencia.segundopunto;

import java.util.ArrayList;
import java.util.List;

class ThreadMultiplicacion implements Runnable {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int fila;
    private final int columna;

    public ThreadMultiplicacion(int[][] A, int[][] B, int[][] C, int fila, int columna) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public void run() {
        int suma = 0;
        for (int k = 0; k < B[0].length; k++) {
            suma += A[fila][k] * B[k][columna];
        }
        C[fila][columna] = suma;
    }
}

class MultiplicacionMatrices {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] B = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        if (A[0].length != B.length) {
            System.out.println("Las matrices no se pueden multiplicar. Columnas de A deben igualar filas de B.");
            return;
        }

        int filasC = A.length;
        int columnasC = B[0].length;
        int[][] C = new int[filasC][columnasC];

        List<Thread> hilos = new ArrayList<>();

        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                ThreadMultiplicacion tarea = new ThreadMultiplicacion(A, B, C, i, j);
                Thread hilo = new Thread(tarea);
                hilos.add(hilo);
                hilo.start();
            }
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Matriz Resultado C:");
        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}