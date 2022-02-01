package GSearch.BBinary;
// Total Comparisons in the worst Case is (logN) where n is Size of the array

public class Binary {
    public static void main(String[] args) {

        int[] arr = { -12, -10, -8, -3, 0, 1, 4, 6, 8, 10, 20, 31 };

        int target = -3;

        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

           int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}
