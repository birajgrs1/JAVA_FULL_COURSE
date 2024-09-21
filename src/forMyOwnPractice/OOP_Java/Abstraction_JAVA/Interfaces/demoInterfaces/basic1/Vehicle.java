package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic1;

public abstract class Vehicle implements Transport {
    private int noOfTyres;

    public abstract void makeStartSound();

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place...");
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going...");
    }
}
