import java.util.Random;

class SharedBuffer {
    int num;
    boolean available = false;
}

class Producer extends Thread {
    private final SharedBuffer buffer;
    public Producer(SharedBuffer buffer) { this.buffer = buffer; }

    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            synchronized (buffer) {
                while (buffer.available) {
                    try { buffer.wait(); } catch (InterruptedException ignored) {}
                }
                buffer.num = rand.nextInt(100) + 1;
                buffer.available = true;
                System.out.println("Produced: " + buffer.num);
                buffer.notify();
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;
    private int evenCount = 0;

    public Consumer(SharedBuffer buffer) { this.buffer = buffer; }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (buffer) {
                while (!buffer.available) {
                    try { buffer.wait(); } catch (InterruptedException ignored) {}
                }
                int num = buffer.num;
                buffer.available = false;
                if (num % 2 == 0) {
                    System.out.println("Consumed " + num + " - Even");
                    evenCount++;
                } else {
                    System.out.println("Consumed " + num + " - Odd");
                }
                buffer.notify();
            }
        }
        System.out.println("Total even numbers: " + evenCount);
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
