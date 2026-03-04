public final class ArrayUtils {

    private ArrayUtils() {
    }

    public static <T> void intercambiar(T[] array, int indice1, int indice2) {
        if (array == null) {
            throw new IllegalArgumentException("El array no puede ser null.");
        }
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            System.out.println("Índices fuera de rango.");
            return;
        }
        T temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    public static <T> void imprimirArray(T[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}