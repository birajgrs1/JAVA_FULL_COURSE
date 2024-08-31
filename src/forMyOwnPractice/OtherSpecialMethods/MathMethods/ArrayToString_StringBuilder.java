package forMyOwnPractice.OtherSpecialMethods.MathMethods;

/*
Take an array of words and concatenate them into a single string
using StringBuilder.
 */
public class ArrayToString_StringBuilder {
    public static void main(String[] args) {
        String[] arr= new String[]{"This"," is", "StringBuilder","demo"," in"," Java."};
        StringBuilder sb= new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);


    }
}
