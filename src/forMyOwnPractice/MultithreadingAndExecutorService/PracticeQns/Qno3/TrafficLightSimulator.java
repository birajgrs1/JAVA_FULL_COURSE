package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno3;

public class TrafficLightSimulator  extends Thread{
    public final Colors colors;

    public TrafficLightSimulator(Colors colors) {
        this.colors = colors;
    }

    @Override
    public void run(){
        System.out.printf("\n %s Active ", colors);
        try {
            Thread.sleep(colors.getTimeInMillis());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("\n %s Inactive ", colors);


    }
}
