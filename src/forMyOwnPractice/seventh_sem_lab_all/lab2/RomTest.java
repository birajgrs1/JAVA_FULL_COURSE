package forMyOwnPractice.seventh_sem_lab_all.lab2;

public class RomTest {
    public static void main(String[] args) {
        BedRoom room1 = new BedRoom(12.4, 16.6, 8.4);
        BedRoom room2 = new BedRoom(15.6, 14.4, 10.2);

        System.out.println("Bedroom 1 Area: " + room1.getArea());
        System.out.println("Bedroom 2 Area: " + room2.getArea());

        System.out.println("Bedroom 1 Volume: " + room1.getVolume());
        System.out.println("Bedroom 2 Volume: " + room2.getVolume());
    }
}
