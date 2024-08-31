package forMyOwnPractice.OtherSpecialMethods.StringMethods;

/*
Define a Student class with fields like name and age, and use
toString to print student details.
 */
class StudentDetails {
    String name;
    int age;
    String gender;
    String rollNo;

    public StudentDetails(String name, int age, String gender, String rollNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student Details: {name: " + name + ", age: " + age +
                ", gender: " + gender + ", roll number: " + rollNo + "}";
    }

    public static void main(String[] args) {
        StudentDetails stu = new StudentDetails("Ram Dahal", 20, "Male", "Stu100");
        System.out.println(stu);

    }
}
