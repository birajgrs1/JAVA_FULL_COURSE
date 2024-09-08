package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.Encaptulation_Basic_Demo.BasicDemo;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setBrand("Maruti");
        car1.setColor("Red");
        car1.setModel("Swift");
        car1.setCost(2500000);

        Car car2 = new Car();
        car2.setBrand("Mahindra");
        car2.setColor("Black");
        car2.setModel("XUV 500");
        car2.setCost(4000000);

        System.out.println("\n ------ First Car ------\n");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Cost: " + car1.getCost());


        System.out.println("\n ------ Second Car ------\n");
        System.out.println(" Model: " + car2.getModel());
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Cost: " + car2.getCost());

    }
}
