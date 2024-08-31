package forMyOwnPractice.OtherSpecialMethods.StringMethods;
/*
Concatenate and Convert: Take two strings, concatenate them,
and convert the result to uppercase.
 */
public class StringConcatenationAndConverting {
    public static void main(String[] args) {

        String str1 = "HeLLo";
        String str2 = "wORld!";
        System.out.println("Concatenation1: "+str1 +" "+str2);

        String str =" ";
       String greet = str1.concat("")+str.concat(str2);
        System.out.println("Concatenation2: "+greet);

//        Converting to uppercase and Lowercase
        System.out.println("Greeting(to Uppercase): "+greet.toUpperCase());
        System.out.println("Greeting(to Lowercase): "+greet.toLowerCase());

    }
}
