package concurrencia.tercerpunto;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TareaMultiplicacion implements Runnable {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int fila;
    private final int columna;

    public TareaMultiplicacion(int[][] A, int[][] B, int[][] C, int fila, int columna) {
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

public class MultiplicacionMatricesExecutor {
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

        // verificar A x B
        if (A[0].length != B.length) {
            System.out.println("Las matrices no se pueden multiplicar. Columnas de A deben igualar filas de B.");
            return;
        }

        // matriz resultado C
        int filasC = A.length;
        int columnasC = B[0].length;
        int[][] C = new int[filasC][columnasC];

        // cantidad de procesadores disponibles
        int numProcesadores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numProcesadores);

        // enviar tareas al pool
        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                executor.submit(new TareaMultiplicacion(A, B, C, i, j));
            }
        }

        // apagar el pool de forma ordenada
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        // Imprimir matriz resultado
        System.out.println("Matriz Resultado C:");
        for (int i = 0; i < filasC; i++) {
            for (int j = 0; j < columnasC; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
