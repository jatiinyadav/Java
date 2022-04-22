package HSorting;

import java.util.Arrays;

public class ALL {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 1, 6, 2, 5 };

        // bubbleSort(arr);
        // cycleSort(arr);
        // insertionSort(arr);
        // arr = mergeSort(arr);
        // selectionSort(arr);
        // quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    static void cycleSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int correct = arr[start] - 1;

            if (arr[start] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[start];
                arr[start] = temp;
            } else {
                start++;
            }
        }
    }

    static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    // MERGE SORT
    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return arr;
    }

    // SELECTION SORT
    static void selectionSort(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int max = maximum(arr, end);

            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
            end--;
        }

    }

    static int maximum(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }

    // QUICK SORT
    static void quickSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int start = left;
        int end = right;

        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {

            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        quickSort(arr, left, end);
        quickSort(arr, start, right);

    }

}
