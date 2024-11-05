package forMyOwnPractice.CollectionAndGenerics.PracticeQuestions.practice1;
class VarArgs {
    public static String concatenateStrings(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append("");
        }
        return sb.toString();
    }

}

public class ConcatenateStringsUsingVarargs {
    /*
    Write a method concatenate Strings that takes variable arguments of String type
     and concatenates them into a single string.
     */


    public static void main(String[] args) {
        System.out.println(VarArgs.concatenateStrings("Hello"));
        System.out.println(VarArgs.concatenateStrings("Hello", " World"));
        System.out.println(VarArgs.concatenateStrings("Hello", " Everyone!"));
    }
}
