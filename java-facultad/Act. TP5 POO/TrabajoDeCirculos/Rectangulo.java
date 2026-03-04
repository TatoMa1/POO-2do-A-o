import java.util.Objects;

public class Rectangulo extends Figura {

    public double ladoMenor;
    public double ladoMayor;

    public Rectangulo(String nombre, String color, Punto punto, double ladoMenor, double ladoMayor) {
        super(nombre, color, punto);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double calcularArea() {
        return (ladoMenor * ladoMayor);
    }

    public double calcularPerimetro() {
        return (2 * ladoMenor + 2 * ladoMayor);
    }

    @Override
    public double area() {
        return calcularArea();
    }

    @Override
    public double perimetro() {
        return calcularPerimetro();
    }

    public void cambiarTamanio(double escalar) {
        this.ladoMenor = ladoMenor * escalar;
        this.ladoMayor = ladoMayor * escalar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLado Menor: " + ladoMenor + "\nLado Mayor: " + ladoMayor;
    }
}