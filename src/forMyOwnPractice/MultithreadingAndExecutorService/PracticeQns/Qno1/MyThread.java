package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno1;

public class MyThread extends Thread {
    int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello from Thread " + threadNumber);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
