package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;


class ThreadPriority extends Thread {
    public void run(){
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + currentThread.getName());
        System.out.println("Current Thread's Priority: " + currentThread.getPriority());
    }

}


