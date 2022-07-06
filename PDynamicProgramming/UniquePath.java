package PDynamicProgramming;

public class UniquePath {

    // Recursion
    // TC: is in exponential
    // SP: Recursion Stack Space
    // It will just return number of ways
    public static int paths(int row, int col) {

        if (row == 1 || col == 1) {
            return 1;
        }

        int left = paths(row - 1, col);
        int right = paths(row, col - 1);

        return left + right;

    }

    // Recursion
    // It will go to the exact destination
    // TC: is in exponential
    // SP: Recursion Stack Space
    public static int paths2(int row, int col) {
        if (row == 0 && col == 0) {
            return 1;
        }

        if (row < 0 || col < 0) {
            return 0;
        }

        int left = paths2(row - 1, col);
        int right = paths2(row, col - 1);

        return left + right;
    }

    // Memoization
    // TC: O(n + m);
    // SP: Recursion Stack Space + O(n + m);
    // Time Complexity is optimised
    public static int paths3(int[][] arr, int row, int col) {
        if (row == 0 && col == 0) {
            return 1;
        }

        if (row < 0 || col < 0)
            return 0;

        if (arr[row][col] != 0) {
            return arr[row][col];
        }

        int left = paths3(arr, row - 1, col);
        int right = paths3(arr, row, col - 1);

        return arr[row][col] = left + right;
    }

    // Tabulation
    // TC: O(n + m);
    // SC: O(n + m);
    public static int path4(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == 0 && j == 0) {
                    arr[i][j] = 1;
                } else {
                    int left = 0;
                    int right = 0;
                    if (i > 0) {
                        left = arr[i - 1][j];
                    }
                    if (j > 0) {
                        right = arr[i][j - 1];
                    }
                    arr[i][j] = left + right;
                }

            }
        }

        return arr[row - 1][col - 1];
    }

    // Tabulation
    // More space optimized
    public static int path5(int row, int col) {
        int[] prev = new int[row];
        int[] curr = new int[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (i == 0 && j == 0)
                    curr[j] = 1;
                else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) {
                        up = prev[j];
                    }
                    if (j > 0) {
                        left = curr[j - 1];
                    }
                    curr[j] = up + left;
                }
            }
            prev = curr;
        }

        return prev[col - 1];
    }

    public static void main(String[] args) {

        int row = 3;
        int col = 3;

        // int ans = paths2(row - 1, col - 1);

        // int[][] arr = new int[row][col];
        // int ans = path4(arr, row, col);

        int ans = path5(row, col);

        System.out.println(Integer.MAX_VALUE);
        System.out.println((int) Math.pow(10, 9));
        System.out.println(ans);
    }
}
