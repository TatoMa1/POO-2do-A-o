package concurrencia.primerpunto;

public class ThreadSimple extends Thread {

    public ThreadSimple(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        String nombre = getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + " - " + i);
            try {
                Thread.sleep((long) (Math.random() * 10)); // 0 a 1000 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Hilo interrumpido: " + nombre);
                return;
            }
        }
        System.out.println("HECHO! " + nombre);
    }
}