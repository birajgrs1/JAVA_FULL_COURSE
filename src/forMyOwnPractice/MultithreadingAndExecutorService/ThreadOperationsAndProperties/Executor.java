package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

public class Executor {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Thread 1");
        ThreadDemo t2 = new ThreadDemo("Thread 2");
        ThreadDemo t3 = new ThreadDemo("Thread 3");

//        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(10);
        t2.setPriority(2);

        int t4 =t3.getPriority();
        System.out.println("Priority: " + t4 + ", priority: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
