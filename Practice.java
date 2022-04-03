import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[][] arr = { { -1, 3, 4 }, { 8, 4 }, { 8, 2 } };

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print("[ ");
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }

}