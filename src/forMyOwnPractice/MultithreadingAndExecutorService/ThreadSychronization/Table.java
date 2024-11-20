package forMyOwnPractice.MultithreadingAndExecutorService.ThreadSychronization;

public class Table {
    synchronized void printTbl(int n){
        System.out.println("Table of: "+n);
        for(int i=1; i<=10; i++){
            System.out.println(i*n+"\t");
        }
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
