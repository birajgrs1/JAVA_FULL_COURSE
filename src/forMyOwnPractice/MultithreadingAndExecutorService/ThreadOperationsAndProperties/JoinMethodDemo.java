package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

class ApplyingJoinMethod extends Thread {
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i++){
            System.out.println(name + " - " + i);
        }
    }
}

class JoinMethodDemo {
    public static void main(String[] args) {
        ApplyingJoinMethod t1 = new ApplyingJoinMethod();
        ApplyingJoinMethod t2 = new ApplyingJoinMethod();
        ApplyingJoinMethod t3 = new ApplyingJoinMethod();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n Run after t2... \n");

        t1.start();
        t3.start();
    }
}
