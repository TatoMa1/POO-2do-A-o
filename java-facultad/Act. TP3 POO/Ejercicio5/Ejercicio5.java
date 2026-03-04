//Considere la siguiente clase:

//public class Entero {
//  private int numero;
// constructor de la clase Enteros
//public Entero(int numero) {
//super();
//this.numero= numero
//}
//public int getNumero() {
//return numero;
//}
//public void setNumero(int numero) {
//this.numero = numero;
//}
//calcula el cuadrado de n
//public long cuadrado(){
// return numero*numero;
//}
//}

//Agregue métodos para calcular, si el numero es par o impar, el factorial de numero, si numeroes primo.Pruebelos.

package Ejercicio5;

public class Ejercicio5 {
    private int numero;

    public Ejercicio5(int numero) {

        super();
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long cuadrado() {
        return numero * numero;
    }

    public String parOimpar() {
        if (numero % 2 == 0)
            return "Es par";
        else
            return "Es impar";
    }

    public long factorial() {
        if (numero < 0) {
            throw new IllegalArgumentException("el numero debe ser positivo para calcular el factorial");
        }
        long fact = 1;
        for (int i = 2; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean esPrimo() {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}
