
class StringException extends Exception {
    public StringException(String mensaje) {
        super(mensaje);
    }
}


class EnteroPositivoException extends Exception {
    public EnteroPositivoException(String mensaje) {
        super(mensaje);
    }
}

public class Empleado {
    private String nombre;
    private Integer sueldo;
    private Integer legajo;

    public Empleado(String nombre, Integer sueldo) throws StringException, EnteroPositivoException {
        if (nombre == null || nombre.length() < 3) {
            throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
        }
        if (sueldo == null || sueldo <= 0) {
            throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
        }
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

  
    public void setNombre(String nombre) throws StringException {
        if (nombre == null || nombre.length() < 3) {
            throw new StringException("El nombre del empleado debe tener 3 o mas caracteres.");
        }
        this.nombre = nombre;
    }

   
    public void setSueldo(Integer sueldo) throws EnteroPositivoException {
        if (sueldo == null || sueldo <= 0) {
            throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
        }
        this.sueldo = sueldo;
    }

   
    public void setLegajo(Integer legajo) throws EnteroPositivoException {
        if (legajo == null || legajo <= 0) {
            throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.");
        }
        this.legajo = legajo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public Integer getLegajo() {
        return legajo;
    }
}