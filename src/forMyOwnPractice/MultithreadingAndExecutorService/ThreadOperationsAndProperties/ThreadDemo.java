package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

class ThreadDemo extends Thread{
    String tname;
    public ThreadDemo(String tname) {
        this.tname = tname;
    }
    public void run() {
        for(int i=9; i>0; i--) {
            System.out.println(tname+" printing: "+i);
        }
    }
}
