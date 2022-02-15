package GSearch.BBinary.Binary2D;

import java.util.Arrays;

// Strictly sorted array means that the numbers are arranged continous

public class StrictlySorted2DArray {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int[] ans = search(arr, 1);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {

        // In case the array is 1D
        int rows = matrix.length;

        if (rows == 1) {
            return binarySearch(matrix[0], rows, target);
        }

        int rStart = 0;
        int rEnd = matrix.length - 1;

        while (rStart <= rEnd) {
            int midRow = rStart + (rEnd - rStart) / 2;
            if (matrix[midRow][0] == target) {
                return new int[] { 0, midRow };
            }
            if (matrix[midRow][0] < target) {
                rows = midRow;
                rStart = midRow + 1;
            } else {
                rEnd = midRow - 1;
            }
        }
        return binarySearch(matrix[rows], rows, target); // binary search function

    }

    static int[] binarySearch(int[] matrix, int row, int target) {

        int cStart = 0;
        int cEnd = matrix.length - 1;

        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }

}
