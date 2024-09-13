package forMyOwnPractice.OOP_Java.Inheritance_JAVA.ObjectClasses.EqualsAndHashCodes;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        String str1 = "Hello";
//        String str2 = "Hello";
        String str2 = "World";

        if (str1.equals(str2)){
            System.out.println(" Both strings are equal, with their respective hashvalues are: "
                    +" "+str1.hashCode()+" "+str2.hashCode());
        }

        else{
            System.out.println(" Both strings are not equal, because their respective hashvalues are: "
                    +" "+str1.hashCode()+" "+str2.hashCode());
        }


    }
}
