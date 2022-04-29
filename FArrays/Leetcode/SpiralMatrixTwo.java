package FArrays.Leetcode;

import java.util.Arrays;

public class SpiralMatrixTwo {
    public static void main(String[] args) {

        int[][] ans = spiralMatrixTwo(3);
        for (int[] res : ans) {
            System.out.println(Arrays.toString(res));
        }

    }

    static int[][] spiralMatrixTwo(int n) {

        int[][] matrix = new int[n][n];

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        int d = 0;
        int num = 1;

        while (top <= bottom && left <= right) {

            if (d == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num;
                    num++;
                }
                top++;
                d = 1;
            } else if (d == 1) {
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num;
                    num++;
                }
                right--;
                d = 2;
            } else if (d == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num;
                    num++;
                }
                bottom--;
                d = 3;
            } else if (d == 3) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num;
                    num++;
                }
                left++;
                d = 0;
            }

        }

        return matrix;

    }
}