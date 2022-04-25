package HSorting;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 6, 2, 3 };

        mergeSortRecursion(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortRecursion(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortRecursion(arr, start, mid);
        mergeSortRecursion(arr, mid, end);

        merge(arr, start, mid, end);

    }

    static void merge(int[] arr, int start, int mid, int end) {

        int[] arra = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                arra[k] = arr[i];
                i++;
            } else {
                arra[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            arra[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            arra[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < arra.length; l++) {
            arr[start + l] = arra[l];
        }

    }
}
