package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;

class ThreadClassDemo extends Thread {
    String tname;
    ThreadClassDemo(String name) {
        tname = name;
        System.out.println("Creating: "+tname);
    }
    public void run() {
        System.out.println("Running: "+tname);
        try{

            for(int i=0; i<10; i++){
                System.out.println("Thread: "+tname+ "printing: "+ i);
                sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+tname + " interrupted.");
        }
        System.out.println("Thread: "+ tname+ " completed.");
    }
}
