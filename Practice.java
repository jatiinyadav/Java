import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int[] ans = search(arr, 10);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {

        int start = 0;
        int end = arr[0].length - 1;

        int rows = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid][0] == target) {
                return new int[] { mid, 0 };
            }

            if (arr[mid][0] < target) {
                rows = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return binarySearch(arr[rows], rows, target);
    }

    static int[] binarySearch(int[] matrix, int row, int target) {

        int start = 0;
        int end = matrix.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (matrix[mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return new int[] { -1, -1 };
    }

}