import java.util.Objects;

public class Cuadrado extends Rectangulo {

    private double lados;

    public Cuadrado(String nombre, String color, Punto centro, double lados) {
        super(nombre, color, centro, lados, lados);
        this.lados = lados;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
        super.setLadoMayor(lados); // es porque hereda del rectangulo,entonces le pasamos el valor de lados, asi
                                   // queda igual
        super.setLadoMenor(lados);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "nombre='" + getNombre() + '\'' +
                ", color='" + getColor() + '\'' +
                ", centro=" + getCentro() +
                ", lados=" + lados +
                '}';
    }
}
