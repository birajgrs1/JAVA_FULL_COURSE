package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

public class Main {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.setName("Hello");
        t2.setName("World");
        t1.start();
        t2.start();
    }
}
