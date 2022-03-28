package JRecursion.Questions.Arrays;

// WRONG ANSWER

public class ERotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 4, 8, 10, 11 };
        int target = 3;
        int ans = binarySearch(arr, 0, arr.length - 1, target);
        System.out.print(ans);
    }

    static int binarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && arr[start] >= target) {
                return binarySearch(arr, start, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        if (target >= arr[mid] && arr[end] >= target) {
            return binarySearch(arr, mid + 1, end, target);
        } else {
            return binarySearch(arr, start, mid - 1, target);
        }
    }

}
