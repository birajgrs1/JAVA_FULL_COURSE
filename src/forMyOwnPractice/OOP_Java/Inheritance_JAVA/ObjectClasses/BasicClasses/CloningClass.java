package forMyOwnPractice.OOP_Java.Inheritance_JAVA.ObjectClasses.BasicClasses;

class CloningClass implements Cloneable {

    int rollNo;
    String name;

    CloningClass(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            CloningClass cloningClass = new CloningClass(1, "CloningClass");
            CloningClass cloningClass1 = (CloningClass) cloningClass.clone();

            System.out.println(cloningClass1.rollNo + " " + cloningClass1.name);
            System.out.println(cloningClass1 + " " + cloningClass1.rollNo + " " + cloningClass1.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
