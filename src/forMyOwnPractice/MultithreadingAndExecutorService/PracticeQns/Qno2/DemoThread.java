package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno2;

public class DemoThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.printf("\n From inside run, %s: %s\n", Thread.currentThread().getName(), Thread.currentThread().getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
