package forMyOwnPractice.OOP_Java.Constructor_Java.ParameterizedConstructors.Practice1;

public class Car {

    String brand;
    String model;
    String color;

    //Constructor
    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getDetails(){
        return "Brand: "+this.brand+", Model: "+this.model+", Color: "+this.color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Maruti", "Ertiga", "Mehroon");
        Car car2 = new Car("Mahindra", "XUV 500", "Black");
        Car car3 = new Car("Maruti", "Swift", "Red");

        System.out.println(car1.getDetails());
        System.out.println(car2.getDetails());
        System.out.println(car3.getDetails());


    }
}
