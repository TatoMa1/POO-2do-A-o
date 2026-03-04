public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Prueba 1: Crear matriz con columnas > máximo permitido...");
            MatrizObjetos m1 = new MatrizObjetos(2, 500); // el número máximo de columnas es 200
            System.out.println("Matriz creada (esto NO debería pasar): " + m1);
        } catch (MatrizException e) {
            System.out.println("Excepción capturada en Prueba 1: " + e);
        }

        try {
            System.out.println("\nPrueba 2: Crear matriz con filas > máximo permitido...");
            MatrizObjetos m2 = new MatrizObjetos(500, 2); // el número máximo de filas es 200
            System.out.println("Matriz creada (esto NO debería pasar): " + m2);
        } catch (MatrizException e) {
            System.out.println("Excepción capturada en Prueba 2: " + e);
        }

        try {
            System.out.println("\nPrueba 3: Crear matriz con dimensiones negativas...");
            MatrizObjetos m3 = new MatrizObjetos(-3, 2);
            System.out.println("Matriz creada (esto NO debería pasar): " + m3);
        } catch (MatrizException e) {
            System.out.println("Excepción capturada en Prueba 3: " + e);
        }

        try {
            System.out.println("\nPrueba 4: setRowCol con fila fuera de rango...");
            MatrizObjetos m4 = new MatrizObjetos(2, 2);
            m4.setRowCol(5, 0, "Dato"); // fila 5 no existe
        } catch (MatrizException e) {
            System.out.println("Excepción capturada en Prueba 4: " + e);
        }

        try {
            System.out.println("\nPrueba 5: getRowCol con columna fuera de rango...");
            MatrizObjetos m5 = new MatrizObjetos(2, 2);
            m5.setRowCol(0, 0, "Dato válido");
            System.out.println(m5.getRowCol(0, 10)); // columna 10 no existe
        } catch (MatrizException e) {
            System.out.println("Excepción capturada en Prueba 5: " + e);
        }

        try {
            System.out.println("\nPrueba correcta: uso válido de la matriz...");
            MatrizObjetos ok = new MatrizObjetos(2, 2);
            ok.setRowCol(0, 0, "A");
            ok.setRowCol(1, 1, "B");
            System.out.println("Matriz válida:\n" + ok);
        } catch (MatrizException e) {
            System.out.println("Esto NO debería fallar: " + e);
        }
    }
}
