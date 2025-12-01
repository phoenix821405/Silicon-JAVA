import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDetails {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        System.out.println("Thread starting...");
        executor.submit(() -> {
            Thread t = Thread.currentThread();
            System.out.println("Thread Name: " + t.getName());
            System.out.println("Thread ID: " + t.threadId());
            System.out.println("Is thread alive? " + t.isAlive());
        });
        executor.shutdown();
    }
}