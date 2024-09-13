package forMyOwnPractice.OOP_Java.Inheritance_JAVA.ObjectClasses.NestedAndInnerClasses;

public class Car {

    private int noOfDoors;

    public void repair(){
        Tyre tyre = new Tyre();
    }

    private class Tyre{
        private double width;
        private double pressure;
        private String materials;

        public void inflate(){
            noOfDoors =2;
        }

    }
}
