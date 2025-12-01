public class ThreadReferenceDetails {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        System.out.println("Class: " + current.getClass());
        System.out.println("Name of Thread: " + current.getName());
        System.out.println("Priority: " + current.getPriority());
        System.out.println("Thread Group Name: " + current.getThreadGroup().getName());
    }
}