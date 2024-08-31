package forMyOwnPractice.OtherSpecialMethods.StringMethods;

public class StringDemo {
    public static void main(String[] args) {



        String name = "Ram Dahal";
        String newName = new String("rAm Dahal");

        System.out.println(name);
        System.out.println(newName);



//        Comparing two strings
        /*
        //using equals method
        if(name.equals(newName)){
            System.out.println("name and new name are the same");
        }

         */

        //using equals-ignore-case
        if(name.equalsIgnoreCase(newName)){
            System.out.println("name and new name are the same");
        }



    }
}
