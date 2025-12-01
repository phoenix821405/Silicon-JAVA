class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-One");
        PriorityThread t2 = new PriorityThread("Thread-Two");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}