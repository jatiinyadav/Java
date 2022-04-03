package HSorting;

import java.util.Arrays;

// Worst Case will be: O(n ^ 2)
// Best Case will be: O(n) 
// Why Insertion Sort: Works good with small Number of elements

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 3, 4, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            sort(arr, 0, i + 1);
        }
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int start, int end) {
 
        for (int i = 0; i <= start; i++) {
            for (int j = end; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
