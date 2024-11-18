package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;


//Creating out thread using Runnable interface
class MyThread implements Runnable {

    public void run() {
        //task for thread...
        for(int i=1; i<=10; i++) {
            System.out.println("Value of i: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
