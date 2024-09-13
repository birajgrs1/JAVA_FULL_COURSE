package forMyOwnPractice.OOP_Java.Inheritance_JAVA.ObjectClasses.EqualsAndHashCodes;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person per = (Person) obj;
        return per.name.equals(name) && per.age == age && per.id.equals(id);
    }

//    @Override
//    public int hashCode() {

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
//        return (int)Math.random()*5;
//    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
