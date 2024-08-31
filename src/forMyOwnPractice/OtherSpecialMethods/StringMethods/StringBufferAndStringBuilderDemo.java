package forMyOwnPractice.OtherSpecialMethods.StringMethods;

public class StringBufferAndStringBuilderDemo {

    public static void main(String[] args) {
         /*
     StringBuffer sb = new StringBuffer("Ram Dahal");   //mutable
//        System.out.println(sb.capacity());
     System.out.println(sb.length());
     System.out.println(sb);
     System.out.println(sb.append(" Shyam Dahal"));
     System.out.println(sb);

     String str = sb.toString();
     System.out.println("str = " + str);

      */

        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(0));
        System.out.println(sb);
        System.out.println(sb.append("Hello Everyone!"));
        System.out.println(sb);

    }

}
