public class TestGenericos {
    public static void main(String[] args) {
        Integer[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println("Array de enteros original:");
        ArrayUtils.imprimirArray(numeros);

        ArrayUtils.intercambiar(numeros, 1, 3); // intercambia 20 y 40
        System.out.println("Array de enteros después del intercambio:");
        ArrayUtils.imprimirArray(numeros);

        String[] palabras = { "Hola", "Mundo", "desde", "Java" };
        System.out.println("Array de strings original:");
        ArrayUtils.imprimirArray(palabras);

        ArrayUtils.intercambiar(palabras, 0, 2); // intercambia "Hola" y "desde"
        System.out.println("Array de strings después del intercambio:");
        ArrayUtils.imprimirArray(palabras);
    }
}