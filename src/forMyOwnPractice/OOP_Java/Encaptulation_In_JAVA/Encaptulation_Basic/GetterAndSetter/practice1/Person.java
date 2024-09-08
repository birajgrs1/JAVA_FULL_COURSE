package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.Encaptulation_Basic.GetterAndSetter.practice1;

public class Person {

    private String name;
    private int age;

//    using getter and setter for both name and ages
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }


    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Ram");
        person.setAge(20);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

//        person.setAge(-6);   ---> Invalid



    }
}
