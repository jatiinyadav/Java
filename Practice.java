import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[][] arr = new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i].length;
            for (int j = 0; j <= k / 2 - 1; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[i][k - i - 1];
                arr[i][k - i - 1] = temp;

            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}