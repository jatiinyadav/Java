package KOOP.OOP1.Two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Creating a single object
        // Student s1 = new Student("Jatin", 23, 56.6f);

        // Creating an array and for the particular index creating an object;
        Student[] arr = new Student[5];

        arr[0] = new Student("Jatin", 23, 56.6f);
        arr[1] = new Student("Yadav", 43, 36.6f);

        System.out.println(arr[2]);

        System.out.println(Arrays.toString(arr));

    }
}
