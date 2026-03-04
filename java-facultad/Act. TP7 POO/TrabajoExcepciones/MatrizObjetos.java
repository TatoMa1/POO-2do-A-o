import java.util.*;

public class MatrizObjetos {
    static final int max_rows = 200;
    static final int max_cols = 200;
    private Vector<Object>[] cuerpo;
    private final int filas;
    private final int columnas;

    public MatrizObjetos(int filas, int columnas) throws MatrizException {
        if (filas <= 0 || columnas <= 0) {
            throw new MatrizException(MatrizException.ERR_DIMENSIONES_NEGATIVAS);
        }
        if (filas > max_rows) {
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }
        if (columnas > max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }

        this.filas = filas;
        this.columnas = columnas;

        cuerpo = new Vector[filas];
        for (int i = 0; i < filas; i++) {
            cuerpo[i] = new Vector<>(columnas);
            // inicializar con nulls para poder hacer set()
            for (int j = 0; j < columnas; j++) {
                cuerpo[i].add(null);
            }
        }
    }

    public void setRowCol(int row, int col, Object obj) throws MatrizException {
        if (row < 0 || row >= filas) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        if (col < 0 || col >= columnas) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
        cuerpo[row].set(col, obj);
    }

    public Object getRowCol(int row, int col) throws MatrizException {
        if (row < 0 || row >= filas) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        if (col < 0 || col >= columnas) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
        return cuerpo[row].elementAt(col);
    }

    @Override
    public String toString() {
        StringBuilder staux = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                staux.append(cuerpo[i].elementAt(j)).append("\t");
            }
            staux.append("\n");
        }
        return staux.toString();
    }
}
