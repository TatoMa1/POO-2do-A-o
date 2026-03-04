package concurrencia.primerpunto;

public class ThreadSimpleTest {
    public static void main(String[] args) {
        ThreadSimple t1 = new ThreadSimple("Argentina");
        ThreadSimple t2 = new ThreadSimple("Uruguay");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Todos los threads terminados.");
    }
}