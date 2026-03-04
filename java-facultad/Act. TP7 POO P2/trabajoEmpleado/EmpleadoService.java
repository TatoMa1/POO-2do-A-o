import java.util.ArrayList;
import java.util.List;


class CollectionVaciaException extends Exception {
    public CollectionVaciaException(String mensaje) {
        super(mensaje);
    }
}


class NoEncontradoException extends Exception {
    public NoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

public class EmpleadoService {
    private static List<Empleado> empleados = new ArrayList<>();

    
    public static Boolean agregar(Empleado empleado) throws EnteroPositivoException {
        
        Integer nuevoLegajo = empleados.size() + 1;
        empleado.setLegajo(nuevoLegajo); 
        empleados.add(empleado);
        return true;
    }

    
    public static Empleado mayorSueldo() throws CollectionVaciaException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        Empleado mayor = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.getSueldo() > mayor.getSueldo()) {
                mayor = e;
            }
        }
        return mayor;
    }

    
    public static Double sueldoPromedio() throws CollectionVaciaException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        double total = 0;
        for (Empleado e : empleados) {
            total += e.getSueldo();
        }
        return total / empleados.size();
    }

    
    public static void eliminar(String nombre) throws CollectionVaciaException, NoEncontradoException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        boolean eliminado = empleados.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));

        if (!eliminado) {
            throw new NoEncontradoException("No se encontro el empleado.");
        }
    }

    
    public static List<Empleado> getEmpleados() {
        return empleados;
    }
}