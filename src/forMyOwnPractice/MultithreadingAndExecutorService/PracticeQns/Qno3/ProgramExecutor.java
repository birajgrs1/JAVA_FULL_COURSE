package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno3;

import java.io.IOException;

public class ProgramExecutor {
    public static void main(String[] args) throws  InterruptedException {
        TrafficLightSimulator red = new TrafficLightSimulator(Colors.RED);
        TrafficLightSimulator green = new TrafficLightSimulator(Colors.GREEN);
        TrafficLightSimulator yellow = new TrafficLightSimulator(Colors.YELLOW);

        red.start();
        red.join();

        green.start();
        green.join();

        yellow.start();

    }
}
