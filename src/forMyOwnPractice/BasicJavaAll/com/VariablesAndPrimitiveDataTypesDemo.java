package forMyOwnPractice.BasicJavaAll.com;

import  java.util.Scanner;

public class VariablesAndPrimitiveDataTypesDemo {
    public static void main(String[] args) {
        /*
        // Not a good way for providing naming
        int a = 5;
        int b = 4;
        int c = a + b;

        System.out.println("Sum = " + c);
        */

        // Proper naming convention techniques
        // snake_case (especially used for constants)
        // camelCase (especially used for variable names)
        // PascalCase (used for classes and interfaces)

/*        //Datatypes: Primitive and non primitives:
-----> Primitives (Built-in Data types):  Non numeric and Numeric
Non numeric: Char, Boolean
Numeric: int, float, short , long , double, byte


----> Non-primitive (User defined data types): String, enum , arrays, classes, ...

 */


        int firstNumber=5;
        int secondNumber=4;
        int sumOfTwoNums=firstNumber+secondNumber;
        System.out.println("Sum of two numbers: "+sumOfTwoNums);

        final float VALUE_OF_PI = 3.1416f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle:");
        float radiusOfCircle = sc.nextFloat();

        float calculateAreaOfCircle = VALUE_OF_PI * radiusOfCircle * radiusOfCircle;

        System.out.println("Area of the circle is: " + calculateAreaOfCircle);

//        Escape sequence
        System.out.print("Hello \"everyone\" !!! \n");
        System.out.println("I am a Java Developer \t Biraj.");

        System.out.print("\n\n--------- \" Escape Sequence to make shape \" ---------\n\n");
        System.out.print("\n * \n * * \n * * * \n * * * * \n * * * * *");
    }
}
