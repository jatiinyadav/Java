package GSearch.BBinary.Binary2D;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        int[][] arr = { { 3, 4, 5, 6 }, { 7, 8, 9, 10 }, { 11, 12, 15, 16 } };
        System.out.println(Arrays.toString(search2D(arr, 15)));
    }

    static int[] search2D(int[][] arr, int target) {

        int top = 0;
        int left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            if (arr[top][right] == target) {
                return new int[] { top, right };
            }

            if (arr[top][right] < target) {
                top++;
            } else if (target < arr[top][right]) {
                right--;
            }
        }

        return new int[] { -1, -1 };
    }
}
