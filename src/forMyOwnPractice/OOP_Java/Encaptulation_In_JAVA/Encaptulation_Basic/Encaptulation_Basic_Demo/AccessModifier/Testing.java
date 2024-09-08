package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.Encaptulation_Basic_Demo.AccessModifier;

public class Testing {

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();
        demo.color = "Black";
        demo.model = "XUV 500";
//        demo.costOfPurchase = 4000000;   ---> Private

        System.out.println(demo);

        AccessModifierDemo newDemo = new AccessModifierDemo("Red", "Swift", 10.00,  3000000);

        System.out.println(newDemo);


    }
}
