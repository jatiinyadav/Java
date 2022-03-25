package JRecursion.Questions.Arrays;

public class FRotatedBinarySearchUsingPivotElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 4, 6, 8 };
        int target = 3;
        int ans = binarySearch(arr, 0, arr.length, target);
        System.out.println(ans);
    }

    static int counter = 0;

    static int binarySearch(int[] arr, int start, int end, int target) {

        int pivot = 0;

        if (counter == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i + 1]) {
                    pivot = i;
                    break;
                }
            }
        }
        
        counter++;
        if (target >= arr[pivot]) {
            end = pivot;

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            return binarySearch(arr, start, pivot, target);
        } else {
            start = pivot + 1;

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            return binarySearch(arr, pivot + 1, end, target);
        }

    }
}
