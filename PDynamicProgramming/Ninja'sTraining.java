// import java.util.*;

// public class Solution {

//     public static int f(int day, int last, int[][] points, int[][] dp) {

//         if (dp[day][last] != -1)
//             return dp[day][last];

//         if (day == 0) {
//             int maxi = 0;
//             for (int task = 0; task < 3; task++) {
//                 if (task != last) {
//                     maxi = Math.max(maxi, points[0][task]);
//                 }
//             }
//             return dp[day][last] = maxi;
//         }

//         int maxi = 0;
//         for (int task = 0; task < 3; task++) {
//             if (task != last) {

//                 int point = points[day][task] + f(day - 1, task, points, dp);
//                 maxi = Math.max(point, maxi);
//             }
//         }

//         return dp[day][last] = maxi;
//     }

//     public static int ninjaTraining(int n, int points[][]) {

//         int[][] dp = new int[n][4];

//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         return f(n - 1, 3, points, dp);
//         // Write your code here..
//     }

// }