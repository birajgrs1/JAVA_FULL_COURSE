package forMyOwnPractice.MultithreadingAndExecutorService.CreatingThreadDemo;

class RunnableDemo implements Runnable {
    String tname;

    RunnableDemo(String n) {
        tname = n;
        System.out.println("Creating: " + tname);
    }

    @Override
    public void run() {
        System.out.println("Running: " + tname);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + tname + " printing: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
