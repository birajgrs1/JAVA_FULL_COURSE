package forMyOwnPractice.MultithreadingAndExecutorService.ThreadSychronization;

public class MainProgram {
    public static void main(String[] args) {
        Table tbl = new Table();

        MyThread x = new MyThread(tbl,4);
        MyThread y = new MyThread(tbl, 5);
        MyThread z = new MyThread(tbl, 9);

        x.start();
        y.start();
        z.start();
    }
}
