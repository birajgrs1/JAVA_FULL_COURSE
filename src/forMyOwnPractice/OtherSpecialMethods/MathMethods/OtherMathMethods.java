package forMyOwnPractice.OtherSpecialMethods.MathMethods;

public class OtherMathMethods {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = -30;
        double radius = 7.5;

        System.out.println("Basic Math Methods:");
        System.out.println("Absolute value of -30 is: " + Math.abs(number2));
        System.out.println("Maximum of 25 and -30 is: " + Math.max(number1, number2));
        System.out.println("Square root of 25 is: " + Math.sqrt(number1));
        System.out.println("Power of 25 raised to 2 is: " + Math.pow(number1, 2));
        System.out.println("Area of the circle with radius 7.5 is: " + Math.PI * Math.pow(radius, 2));

        // Logarithmic Math Methods
        double number = 10;

        System.out.println("\nLogarithmic Math Methods:");
        System.out.println("Natural logarithm of 10 is: " + Math.log(number));
        System.out.println("Logarithm base 10 of 10 is: " + Math.log10(number));
        System.out.println("Logarithm of (1 + 10) is: " + Math.log1p(number));

        // Trigonometric Math Methods
        double degrees = 45;
        double radians = Math.toRadians(degrees);

        System.out.println("\nTrigonometric Math Methods:");
        System.out.println("Sine of 45 degrees is: " + Math.sin(radians));
        System.out.println("Cosine of 45 degrees is: " + Math.cos(radians));
        System.out.println("Tangent of 45 degrees is: " + Math.tan(radians));

        // Hyperbolic Math Methods
        double value = 1.0;

        System.out.println("\nHyperbolic Math Methods:");
        System.out.println("Hyperbolic sine of 1.0 is: " + Math.sinh(value));
        System.out.println("Hyperbolic cosine of 1.0 is: " + Math.cosh(value));
        System.out.println("Hyperbolic tangent of 1.0 is: " + Math.tanh(value));

        // Angular Math Methods
        double angleDegrees = 180;

        System.out.println("\nAngular Math Methods:");
        System.out.println("180 degrees is " + Math.toRadians(angleDegrees) + " radians.");
        System.out.println("π radians is " + Math.toDegrees(Math.PI) + " degrees.");
    }
}
