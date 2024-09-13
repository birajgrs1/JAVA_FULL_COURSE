package forMyOwnPractice.OOP_Java.Inheritance_JAVA.ObjectClasses.EqualsAndHashCodes;

public class MainEqualsAndHashCode {
    public static void main(String[] args) {
        Person person1  = new Person("Ram", "p100", 20);
        Person person2  = new Person("Ram", "p100", 20);

        if(person1.equals(person2)) {
            System.out.println("Both persons are equal");
        }
        else{
            System.out.println("Both persons are not equal");
        }


    }
}
