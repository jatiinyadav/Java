package GSearch.BBinary;
public class CheckArray {
    public static void main(String[] args) {
        // int[] arr = { -15, -10, -8, -2, 0, 1, 3, 5, 7, 9, 10, 13 };
        int[] arr = { 15, 10, 8, 2, 0, -1, -3, -5, -7, -9, -10, -13 };

        int target = -7;
       System.out.println( binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean ans = arr[start] > arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ans) {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
