package forMyOwnPractice.MultithreadingAndExecutorService.ThreadSychronization;

public class Counter {
    private int counter =1;

    //sychronized method to increment counter
    public synchronized void increment() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }

}
