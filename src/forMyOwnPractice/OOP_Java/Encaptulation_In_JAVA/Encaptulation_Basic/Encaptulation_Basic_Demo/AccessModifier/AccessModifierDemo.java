package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.Encaptulation_Basic_Demo.AccessModifier;

public class AccessModifierDemo {

    public String color;

    public String model;

    private double fuelLevel;

    long costOfPurchase;   // default

    public AccessModifierDemo() { }

    public AccessModifierDemo(String color,String model , double fuelLevel, long costOfPurchase  ) {

        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "AccessModifierDemo{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';



    }
}
