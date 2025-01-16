package forMyOwnPractice.seventh_sem_lab_all.lab2;

class BedRoom extends Room{
    public double height;

    BedRoom(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }
    double getVolume(){
        return length*breadth*height;
    }
}
