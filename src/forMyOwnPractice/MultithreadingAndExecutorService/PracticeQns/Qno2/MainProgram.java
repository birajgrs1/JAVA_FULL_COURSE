package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno2;


public class MainProgram {
    public static void main(String[] args) throws InterruptedException {
        DemoThread t1 = new DemoThread();
        System.out.printf("\n Create the thread %s ", t1.getState());

        t1.start();
        t1.join();
        System.out.printf("Thread finished  %s ", t1.getState());





    }
}
