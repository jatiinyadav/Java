package PDynamicProgramming;

import java.util.Arrays;

public class Main {
    // Recursion : Top to Down Approach
    // We start from the given data and go to the base case

    // Tabulation: Bottom to Up Approach
    // We start from the base case and go to the given data

    public static void main(String[] args) {

        int[][] dp = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 0 && j == 0)
                    dp[0][0] = 1;
                else {
                    int up = 0;
                    if (i > 0) {
                        up = dp[i - 1][j];
                    }
                    int left = 0;
                    if (j > 0) {
                        left = dp[i][j - 1];
                    }
                    dp[i][j] = up + left;
                }

            }
        }

        for (int[] arr : dp) {
            System.out.println(Arrays.toString(arr));
        }

    }

    // Fibonacci

    // 1D Recurrence Relations

    // https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650

    // How to identify DP/Recursion question?
    // The questions can be:
    // 1. Count the total number of ways
    // 2. There are multiple ways to do it find minimum or maximum
    // 3. Try all possible ways
    // 4. Best way among all

    // To solve the problem after identification.
    // 1. Try to represent the given problem in terms of index.
    // 2. Do all possible operations on that index according to the problem
    // statement.
    // 3. To count all possible ways - sum of all stuff.
    // To find minimum/maximum - Take Minimum/maximum of all stuff.

}

// Memoization to Tabulation
// Start from the base case
// Express all in for loops
// Copy the recurrence

// Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/

// Min Cost
// https://leetcode.com/problems/min-cost-climbing-stairs/

// Frog Jump
// https://leetcode.com/problems/frog-jump/

// Ninja's Training
// https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003

// Unique Path 1
// https://www.codingninjas.com/codestudio/problems/total-unique-paths_1081470

