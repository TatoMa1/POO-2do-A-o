package Ejercicio6;

import java.util.Scanner;

public class ejercicioMain {

    public static void main(String[] args) {

        try (Scanner Scanner = new Scanner(System.in)) {
            empleado empleadoConMayorSueldo = null;
            double sueldoMayor = 0;
            double contadorSalario = 0;

            System.out.println("ingrese la cantidad de empleados a registrar:");
            int cantidad = Scanner.nextInt();
            Scanner.nextLine();

            for (int i = 0; i < cantidad; i++) {
                System.out.print("nombre: ");
                String nombre = Scanner.nextLine();

                System.out.print("apellido: ");
                String apellido = Scanner.nextLine();

                System.out.print("salario: ");
                double salario = Scanner.nextDouble();
                Scanner.nextLine();
                empleado empleado = new empleado(nombre, apellido, salario);
                contadorSalario = contadorSalario + empleado.getSalario();

                System.out.println("empleado registrado: " + empleado.getNombre() + " " + empleado.getApellido()
                        + " su salario es :" + empleado.getSalario() + "$");

                if (empleado.getSalario() > sueldoMayor) {
                    sueldoMayor = empleado.getSalario();
                    empleadoConMayorSueldo = empleado;
                }
            }
            System.out.println("el salario promedio de los empleados es: " + (contadorSalario / cantidad));
            System.out.println("el empleado con mayor sueldo es: " + empleadoConMayorSueldo.getNombre()
                    + " " + empleadoConMayorSueldo.getApellido()
                    + " con un salario de: " + empleadoConMayorSueldo.getSalario() + "$");
        }
    }
}