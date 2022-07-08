package PDynamicProgramming;

public class Main {
    // Recursion : Top to Down Approach
    // We start from the given data and go to the base case

    // Tabulation: Bottom to Up Approach
    // We start from the base case and go to the given data

    public static void main(String[] args) {

        int i, j, count;
        count = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                count++;
            }
        }
        System.out.println(count);

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
