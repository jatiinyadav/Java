import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        List<Integer> ls = new ArrayList<>();

        int[] col = new int[matrix[0].length];
        int[] row = new int[matrix.length];

        min(matrix, row, col);

        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));

    }

    public static void min(int[][] matrix, int[] row, int[] col) {

        int ind1 = 0;
        int ind2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[j][i]);
            }
            row[ind1++] = min;
            col[ind2++] = max;
        }

        int ro = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            
        }

    }

    public static void max(int[][] matrix, int j) {

        int minim = Integer.MIN_VALUE;

        for (int row = j; row < matrix.length; row++) {
            minim = Math.max(minim, matrix[row][j]);
        }

    }
}