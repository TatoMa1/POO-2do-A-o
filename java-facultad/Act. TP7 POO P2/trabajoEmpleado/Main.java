public class Main {
    public static void main(String[] args) {

        
        try {
            System.out.println("Intentando crear empleado con nombre inválido...");
            new Empleado("Jo", 20000);
        } catch (StringException se) {
            System.err.println("Excepción: " + se.getMessage());
        } catch (EnteroPositivoException ee) {
            System.err.println("Excepción: " + ee.getMessage());
        }

        try {
            System.out.println("Intentando crear empleado con sueldo inválido...");
            new Empleado("Pedro", 0); 
        } catch (StringException se) {
            System.err.println("Excepción: " + se.getMessage());
        } catch (EnteroPositivoException ee) {
            System.err.println("Excepción: " + ee.getMessage());
        }

        
        try {
            System.out.println("\nPrueba: obtener mayor sueldo sin empleados...");
            EmpleadoService.mayorSueldo(); 
        } catch (CollectionVaciaException ce) {
            System.err.println("Excepción: " + ce.getMessage());
        }

        try {
            System.out.println("Prueba: calcular sueldo promedio sin empleados...");
            EmpleadoService.sueldoPromedio(); 
        } catch (CollectionVaciaException ce) {
            System.err.println("Excepción: " + ce.getMessage());
        }

        try {
            System.out.println("Prueba: eliminar sin empleados...");
            EmpleadoService.eliminar("Gonzalo"); 
        } catch (CollectionVaciaException ce) {
            System.err.println("Excepción: " + ce.getMessage());
        } catch (NoEncontradoException ne) {
            System.err.println("Excepción: " + ne.getMessage());
        }

       
        try {
            System.out.println("\nAgregando empleados válidos...");
            Empleado e1 = new Empleado("Gonzalo", 50000);
            Empleado e2 = new Empleado("Joaquin", 70000);
            Empleado e3 = new Empleado("Oscar", 45000);

            EmpleadoService.agregar(e1);
            EmpleadoService.agregar(e2);
            EmpleadoService.agregar(e3);

            System.out.println("Empleados agregados correctamente.");

           
            Empleado mejorPago = EmpleadoService.mayorSueldo();
            System.out.println("Empleado con mayor sueldo: "
                    + mejorPago.getNombre()
                    + " - $" + mejorPago.getSueldo());

            
            Double promedio = EmpleadoService.sueldoPromedio();
            System.out.println("Sueldo promedio: $" + promedio);

            
            EmpleadoService.eliminar("Joaquin");
            System.out.println("Empleado 'Joaquin' eliminado correctamente.");

            
            EmpleadoService.eliminar("Oscarcito"); 

        } catch (StringException se) {
            System.err.println("Excepción: " + se.getMessage());
        } catch (EnteroPositivoException ee) {
            System.err.println("Excepción: " + ee.getMessage());
        } catch (CollectionVaciaException ce) {
            System.err.println("Excepción: " + ce.getMessage());
        } catch (NoEncontradoException ne) {
            System.err.println("Excepción: " + ne.getMessage());
        }
    }
}