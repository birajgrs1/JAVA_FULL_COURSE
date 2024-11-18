package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;

// Creating thread using Thread class
class AnotherThread extends Thread {
    public void run() {
        for(int i =10 ; i>=1; i--){
            System.out.println("Another Thread's values: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
