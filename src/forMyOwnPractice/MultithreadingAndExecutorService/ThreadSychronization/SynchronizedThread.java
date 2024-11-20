package forMyOwnPractice.MultithreadingAndExecutorService.ThreadSychronization;

public class SynchronizedThread extends Thread {
    private Counter counter;

    public SynchronizedThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}
