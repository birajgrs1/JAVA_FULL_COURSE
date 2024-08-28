package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Using_This_Keywords.Practice3;

// Calling Another Method in the Same Class
public class Calculator {

    public void calculateSquare(int number){
        int res = number*number;
        System.out.println("Square: "+res);
    }
    public void calculateCube(int number){
        int res = number*number*number;
        System.out.println("Cube: "+res);
    }
    //method to display the square of thr number
    public void displaySquare(int number){
        this.calculateSquare(number);
    }
    //method to display the cube of the number
    public void displayCube(int number){
        this.calculateCube(number);
    }




}
