package forMyOwnPractice.ArraysInJava.ArrayIntroduction;

public class SingleDimentionalArrayDemo {

    public static void main(String[] args) {
//        int age[];
//        age = new int[5];

        int age[] = new int[5];
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;
        age[4] = 50;

        String names[]  = {"Ram", "Shyam", "Hari","Sita","Gita"};

//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
        System.out.println("Show all indexed  age: ");

        for (int i = 0; i < age.length; i++) {
//            System.out.println(age[i]);
            System.out.println("Age " + i + ": " + age[i]);
        }

//        Using for-each loop
        System.out.println("\nShow all indexed  names: ");
        for(String name: names){
            System.out.println("Name : "+  name);
        }

    }
}
