package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;

public class main {
    public static void main(String[] args) {
        /*
        //Create a object of MyThread Class
        MyThread t1= new MyThread();
        Thread t2 = new Thread(t1);
        t2.start();

         */

        //Object of another thread
        AnotherThread  t1 = new AnotherThread();
        t1.start();


    }
}
