package forMyOwnPractice.CollectionAndGenerics.SetInterfaces;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashSetDemo {
    public static void main(String[] args) {

        /*
        Set<String> set = new HashSet<String>();

        set.add("Ram");
        set.add("Ram");   //not counts
        set.add("Shyam");
        set.add("Shyam");  //not counts
        set.add("Hari");

        System.out.println(set.size());
        System.out.println(set);

         */

        Set<Student> set = new HashSet<>();
//        set.add(new Student(1, "Rohit"));
//        set.add(new Student(1, "Rohit"));
        set.add(new Student(1, "Rohit"));
        set.add(new Student(1, "Bijaya"));
        System.out.println(set);
        System.out.println();

    }
}
