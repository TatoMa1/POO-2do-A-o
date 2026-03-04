package concurrencia.primerpunto;

public class TareaSimple {
    private final String nombre;

    public TareaSimple(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutar() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + " - " + i);
            try {
                Thread.sleep((long) (Math.random() * 10)); // 0 a 1000 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Tarea interrumpida: " + nombre);
                return;
            }
        }
        System.out.println("HECHO! " + nombre);
    }
}
