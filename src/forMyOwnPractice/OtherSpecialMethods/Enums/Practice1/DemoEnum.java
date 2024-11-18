package forMyOwnPractice.OtherSpecialMethods.Enums.Practice1;

public class DemoEnum {
    public enum Colors{
        Red, Green, Blue, White;
    }
    public static void main(String[] args) {
//        Colors color = Colors.Blue;
//        System.out.println(color);

        //Traversing the enu,
        for(Colors c : Colors.values()){
            System.out.println(c.name());
        }

    }
}
