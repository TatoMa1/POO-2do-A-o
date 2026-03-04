import java.util.ArrayList;
import java.util.List;

public class Circulo extends Elipse {

    public Circulo(String nombre, String color, Punto centro, double radio) {
        // Un círculo es una elipse con ambos radios iguales
        super(nombre, color, centro, radio, radio);
    }

    public double getRadio() {
        return getRadioMayor(); // no hay radio menor ni mayor, pero se hereda radioMayor de la elipsee
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * getRadio();
    }

    @Override
    public String toString() {
        return super.toString() + " (Círculo)";
    }
}
