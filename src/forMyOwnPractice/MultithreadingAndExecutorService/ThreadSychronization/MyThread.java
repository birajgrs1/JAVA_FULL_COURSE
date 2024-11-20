package forMyOwnPractice.MultithreadingAndExecutorService.ThreadSychronization;

public class MyThread extends Thread {
    Table t;
    int n;
    MyThread(Table t, int n){
        this.t = t;
        this.n = n;
    }
    public void run(){
        t.printTbl(n);
    }

}
