package forMyOwnPractice.OtherSpecialMethods.StringMethods;

import java.util.Locale;

public class StringClassesDemo {
    public static void main(String[] args) {

        String firstName = "   Ram";
        String lastName = "Dahal ";
        String email = "ramdahal@gmail.com";

        String greeting = "heLLoWorLd";

        // String fullName = System.out.println(firstName+""+lastName);
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

        System.out.println("Length of fullname: " + fullName.length());

        // CharAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();

        // Replace
        String newFirstName = "Shyam";
        String newFullName = fullName.replace(firstName, newFirstName);
        System.out.println("New Full name: " + newFullName);

        // Split email into local part and domain
        String[] emailParts = email.split("@");
        if (emailParts.length == 2) {
            String localPart = emailParts[0]; // Part before '@'
            String domain = emailParts[1];    // Part after '@'
            System.out.println("Local part: " + localPart);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid email format.");
        }


        //Uppercase and lowercase
        System.out.println("Greeting(in lowercase): "+greeting.toLowerCase());
        System.out.println("Greeting(uppercase): "+greeting.toUpperCase());

        //trim
        System.out.println("Trim FullName: "+fullName.trim());

    }
}
