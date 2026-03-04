public abstract class Figura {
    private String nombre;
    private String color;
    private Punto centro;

    public Figura(String nombre, String color, Punto centro) {
        this.nombre = nombre;
        this.color = color;
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void mover(int nuevaX, int nuevaY) {
        centro.mover(nuevaX, nuevaY); // delega a Punto
    }

    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nColor: " + color +
                "\nCentro: " + centro;
    }
}
