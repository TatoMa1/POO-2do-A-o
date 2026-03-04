public class MatrizException extends Exception {
    public static final int ERR_COLUMNAS_EXCEDIDAS = 1;
    public static final int ERR_FILAS_EXCEDIDAS = 2;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 3;
    public static final int ERR_FILA_FUERA_DE_RANGO = 4;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 5;

    private static final String[] ERRORES = {
            "El número de columnas excede el máximo permitido.",
            "El número de filas excede el máximo permitido.",
            "Las dimensiones de la matriz no pueden ser negativas.",
            "El índice de la fila está fuera de rango.",
            "El índice de la columna está fuera de rango."
    };

    private final String mensaje;

    public MatrizException(int codigoError) {
        super(ERRORES[codigoError]);
        this.mensaje = ERRORES[codigoError];
    }

    public MatrizException(String mensajePersonalizado) {
        super(mensajePersonalizado);
        this.mensaje = mensajePersonalizado;
    }

    @Override
    public String toString() {
        return "ERROR MATRIZ: " + mensaje;
    }
}
