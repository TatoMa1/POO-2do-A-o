//Clasificador de Calificaciones:
//Ingresa una calificación numérica(por ejemplo,de 0 a 10)
//.Utiliza una serie de if-elseif-else para clasificar la calificación en categorías como"Aprobado","Reprobado","Sobresaliente",etc
//.Define tus propios rangos

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("ingrese una calificacion");
            int calificacion = Scanner.nextInt();
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("debe ingresar un numero entre mayor de 0 y menor de 10");
            } else if (calificacion >= 8 && calificacion <= 10) {
                System.out.println("aprobado");
            } else if (calificacion >= 5 && calificacion < 8) {
                System.out.println("suficiente");
            } else if (calificacion >= 0 && calificacion < 5) {
                System.out.println("reprobado");
            }
        }
    }
}
