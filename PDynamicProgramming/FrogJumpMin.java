package PDynamicProgramming;

public class FrogJumpMin {

    // Recursion
    // public static int f(int ind, int[] heights) {
    // if (ind == 0)
    // return 0;

    // int left = f(ind - 1, heights) + Math.abs(heights[ind] + heights[ind - 1]);
    // int right = Integer.MAX_VALUE;

    // if (right > 1) {
    // right = f(ind - 2, heights) + Math.abs(heights[ind] + heights[ind - 2]);
    // }

    // return Math.min(left, right);
    // }

    // Memoization
    // public static int f(int ind, int[] heights, int[] arr) {
    // if (ind == 0)
    // return 0;

    // if (arr[ind] != 0)
    // return arr[ind];

    // int left = f(ind - 1, heights, arr) + Math.abs(heights[ind] - heights[ind -
    // 1]);
    // int right = Integer.MAX_VALUE;
    // if (ind > 1) {
    // right = f(ind - 2, heights, arr) + Math.abs(heights[ind] - heights[ind - 2]);
    // }

    // return arr[ind] = Math.min(left, right);
    // }

    // Tabulation
    // public static void f(int ind, int[] heights, int[] dp) {

    // dp[0] = 0;
    // for (int i = 1; i <= heights.length - 1; i++) {
    // int first = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);

    // int right = Integer.MIN_VALUE;
    // if (i > 1) {
    // right = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
    // }

    // dp[i] = Math.min(first, right);
    // }

    // }

    // Tabulation : reducing Space Complexity
    public static void f(int ind, int[] heights) {
        int prev2 = 0;
        int prev = 0;
 
        for (int i = 1; i < ind; i++) {
            int left = prev + Math.abs(heights[i] - heights[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 2) {
                right = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }

            int curr = Math.min(left, right);
            prev2 = prev;
            prev = curr;
        }
    }

    public static void main(String[] args) {

        int[] heights = { 2, 4, 5, 7, 10 };

        // Recursion : Time limit Exceed
        // f(heights.length - 1, heights);

        // Memoization: Optimised
        // Top down approach
        // int[] arr = new int[heights.length + 1];
        // f(heights.length - 1, heights, arr);

        // Tablulation : Much more optimised
        // Bottom up approach
        // int[] dp = new int[heights.length + 1];
        // f(heights.length - 1, heights, dp);

        // Tablulation: Reduced SC
        f(heights.length - 1, heights);

    }
}
