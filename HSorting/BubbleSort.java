package HSorting;

import java.util.Arrays;

// Time Complexity : As the input grows, how the time grows
// Best Case: O(n) N is the size of the array 
// (It is actaully n - 1 but in the Time Comlexity Constant are ignored)

// Worst Case: O(n^2): If the given array is in descending order

// Space Complexity: As the input grows, how the space grows
// O(n^2) N is the size of the Array

// If we ran the loop ans the value of j didn't swapped break the loop
// This means that the array is Sorted

public class BubbleSort{
    public static void main(String[] args) {

        int[] arr = { 1, 5, 3, 8, 2 };

        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }

            if (!swapped) {
                break;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}