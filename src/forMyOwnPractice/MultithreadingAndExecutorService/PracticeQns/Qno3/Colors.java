package forMyOwnPractice.MultithreadingAndExecutorService.PracticeQns.Qno3;

public enum Colors {
    RED(6000), YELLOW(1000), GREEN(3000);

    private final int timeInMillis;

    public int getTimeInMillis() {
        return timeInMillis;
    }

    Colors(int timeInMillis) {
         this.timeInMillis = timeInMillis;
    }
}
