import java.util.Arrays;

// /The worst case will be O(n^2)
// The best case will also be O(n^2)
//  Because we are finding the greatest element in the array
// It is not stable
// Use case is: It perform well in small lists/arrays

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 10, 6, -9, 2 };

        for (int i = 0; i <= arr.length - 1; i++) {

            int last = arr.length - i - 1;
            int max = maxNumber(arr, 0, last);
            swap(arr, max, last);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    static int maxNumber(int[] arr, int start, int last) {
        int ans = start;

        for (int i = 0; i <= last; i++) {

            if (arr[i] > arr[ans]) {
                ans = i;
            }

        }
        return ans;
    }

}
