package forMyOwnPractice.OOP_Java.Abstraction_JAVA.AbstractionBasics.Basic1;

public abstract class Vehicle {
    private int noOfTyres;

    public abstract void makeStartSound();

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going...");
    }
}
