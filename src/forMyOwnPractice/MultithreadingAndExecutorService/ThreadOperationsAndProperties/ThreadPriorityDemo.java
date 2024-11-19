package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setPriority(8);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }


        // System.out.println("Child Thread Priority: " + t.getPriority());
        // System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
    }
}
