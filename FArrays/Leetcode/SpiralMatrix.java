package FArrays.Leetcode;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        ArrayList<Integer> ans = spiralMatrix(matrix);
        System.out.println(ans);
    }

    static ArrayList<Integer> spiralMatrix(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        int d = 0;

        while (top <= bottom && left <= right) {

            if (d == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
                d = 1;
            } else if (d == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                d = 2;
            } else if (d == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
                d = 3;
            } else if (d == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                d = 0;
            }

        }

        return list;
    }
}
