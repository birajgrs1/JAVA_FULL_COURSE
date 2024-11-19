package forMyOwnPractice.MultithreadingAndExecutorService.ThreadOperationsAndProperties;

public class ThreadOperationsDemo {

    public static void main(String[] args) {

        System.out.println("Program Started...");

        int sum = 10 + 20;
        System.out.println("Sum is " + sum);

        // Thread...
        Thread th = Thread.currentThread();
        String thName = th.getName();
        System.out.println("Current running thread is " + thName);

        // rename
        th.setName("MyMain");
        System.out.println("New name: " + th.getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //get id
        System.out.println(th.threadId());

        System.out.println("Program terminated.");
    }
}
