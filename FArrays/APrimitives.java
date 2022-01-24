package FArrays;
// In this code we are taking inputs of primitives
// Arrays of Primitives

import java.util.Arrays;
import java.util.Scanner;

public class APrimitives {
    public static void main(String[] args) {

        System.out.print("Enter Limit: ");

        Scanner input = new Scanner(System.in);

        int limit = input.nextInt();

        // Array of Primitives
        int[] arr = new int[limit];
        arrays(arr, limit, input);
        input.close();
    }

    static void arrays(int[] arr, int limit, Scanner input) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " Number: ");
            arr[i] = input.nextInt();
        }

        // 3 ways of printing an Array

        // 1st
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // 2nd
        // for (int num : arr) {
            // System.out.print(num + " "); // Num Represents Element of Array
        // }

        // 3rd Best Way
        System.out.println(Arrays.toString(arr));
        

    }

}