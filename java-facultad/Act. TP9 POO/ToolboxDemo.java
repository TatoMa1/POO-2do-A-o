import java.util.Arrays;
public class ToolboxDemo {

    // sin genericos
    public static void swapInts(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void swapDoubles(double[] a, int i, int j) {
        double tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void swapStrings(String[] a, int i, int j) {
        String tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // con genericos
    public static <T> void swap(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static String arrToString(int[] a) {
        return Arrays.toString(a);
    }

    private static String arrToString(double[] a) {
        return Arrays.toString(a);
    }

    private static <T> String arrToString(T[] a) {
        return Arrays.toString(a);
    }

    public static void main(String[] args) {
        // ejecucion sin generico
        System.out.println("Sin genéricos ");
        int[] ints = { 1, 2, 3, 4 };
        double[] doubles = { 1.1, 2.2, 3.3 };
        String[] strings = { "uno", "dos", "tres" };

        System.out.println("Antes:    " + arrToString(ints));
        swapInts(ints, 0, 3);
        System.out.println("Después:  " + arrToString(ints));
        System.out.println();

        System.out.println("Antes: " + arrToString(doubles));
        swapDoubles(doubles, 0, 2);
        System.out.println("Después: " + arrToString(doubles));
        System.out.println();

        System.out.println("Antes: " + arrToString(strings));
        swapStrings(strings, 0, 2);
        System.out.println("Después: " + arrToString(strings));
        System.out.println();

        // ejecucion con generico
        System.out.println("Con genéricos ");
        Integer[] integers = { 10, 20, 30, 40 };
        String[] words = { "alpha", "beta", "gamma" };

        System.out.println("Antes: " + arrToString(integers));
        swap(integers, 1, 3);
        System.out.println("Después: " + arrToString(integers));
        System.out.println();

        System.out.println("Antes: " + arrToString(words));
        swap(words, 0, 2);
        System.out.println("Después: " + arrToString(words));
    }
}