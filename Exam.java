import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 6, 5, 4 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i < mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            ans[k] = arr[j];
            j++;
            k++;
        }

    }

}