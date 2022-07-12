package TSComplexity;

import java.util.Arrays;

public class HFlip {
    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        for (int[] row : arr) {
            for (int j = 0; j <= (arr[0].length - 1) / 2; j++) {
                int temp = row[j] ^ 1;
                row[j] = row[arr[0].length - 1 - j] ^ 1;
                row[arr[0].length - 1 - j] = temp;
            }
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}
