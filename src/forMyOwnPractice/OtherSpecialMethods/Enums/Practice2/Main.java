package forMyOwnPractice.OtherSpecialMethods.Enums.Practice2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- Printing all the days of week -----------");
//        for(Days day : Days.values() ){
//            System.out.println(day);
//        }

        for(Days day : Days.values()){
            System.out.printf("%s : %s\n", day, day.getType());
        }

    }
}
