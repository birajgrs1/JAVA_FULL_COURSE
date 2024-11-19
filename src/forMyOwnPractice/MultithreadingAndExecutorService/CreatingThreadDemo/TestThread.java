package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;

public class TestThread {
    public static void main(String[] args) {
        ThreadClassDemo demo1 = new ThreadClassDemo("t1");
        demo1.start();

        ThreadClassDemo demo2 = new ThreadClassDemo("t2");
        demo2.start();
    }
}
