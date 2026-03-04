public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String nombre, String color, Punto centro, double radioMayor, double radioMenor) {
        super(nombre, color, centro);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public void cambiarTamanio(double factor) {
        if (factor <= 0) {
            System.out.println("Factor inválido, debe ser mayor que 0.");
            return;
        }
        radioMayor *= factor;
        radioMenor *= factor;
    }

    public double area() {
        return Math.PI * radioMayor * radioMenor;
    }

    public double perimetro() {
        // Fórmula aproximada de Ramanujan
        return Math.PI * (3 * (radioMayor + radioMenor) -
                Math.sqrt((3 * radioMayor + radioMenor) * (radioMayor + 3 * radioMenor)));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRadio Mayor: " + radioMayor +
                "\nRadio Menor: " + radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

}
