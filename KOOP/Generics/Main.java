package KOOP.Generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(2, 30);
        Student s2 = new Student(3, 20);
        Student s3 = new Student(4, 70);
        Student s4 = new Student(5, 10);

        // If we are using Student class compareTo function
        // if (s2.compareTo(s4) < 0) {
        //     System.out.println("S4 is greater");
        // } else{
        //     System.out.println("S2 is greater");
        // }

        // If we are not using Student class compareTo method
        Student[] arr = { s1, s2, s3, s4 };
        System.out.println(Arrays.toString(arr));

        // Lambda Functions
        Arrays.sort(arr, (o1, o2) -> -(o1.marks - o2.marks));

        System.out.println(Arrays.toString(arr));
    }
}
