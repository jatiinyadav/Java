package KOOP.OOP6.Compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(23, 43.65f);
        Student s2 = new Student(33, 83.34f);
        Student s3 = new Student(43, 56.29f);

        if (s1.compareTo(s2) < 0) {
            System.out.println("S2 has greater marks " + s2.marks);
        } else {
            System.out.println("S2 has greater marks " + s2.marks);
        }

        Student[] arr = {s1, s2, s3};

        // Here it will sort according to the marks, because in the compare to method
        // we have added marks
        Arrays.sort(arr);

        // Sort method also accepts lambda function as a parameter
        Arrays.sort(arr, (o1, o2) -> -(int)(o1.marks -o2.marks));

        System.out.println(Arrays.toString(arr));
    }
}
