import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo("Rect1", "Rojo", new Punto(0, 0), 4, 6));
        figuras.add(new Cuadrado("Cuad1", "Azul", new Punto(1, 1), 5));
        figuras.add(new Elipse("Elip1", "Verde", new Punto(2, 2), 3, 2));
        figuras.add(new Circulo("Circ1", "Amarillo", new Punto(3, 3), 4));

        for (Figura f : figuras) {
            System.out.println(f);
            System.out.println("Área: " + f.area());
            System.out.println("Perímetro: " + f.perimetro());
        }

        // Mostrar antes de cambios
        System.out.println("=== Figuras originales ===");
        for (Figura f : figuras) {
            System.out.println(f);
            System.out.println();
        }

        // Cambiar color y mover todas
        String nuevoColor = "Negro";
        int nuevaX = 4;
        int nuevaY = 3;

        for (Figura f : figuras) {
            f.setColor(nuevoColor);
            f.mover(nuevaX, nuevaY);
        }

        // Mostrar después de cambios
        System.out.println("=== Figuras modificadas ===");
        for (Figura f : figuras) {
            System.out.println(f);
            System.out.println();
        }
    }
}
