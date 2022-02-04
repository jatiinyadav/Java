// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {

//         int start = 1;
//         int end = n;

//         if (n == 1) {
//             return 1;
//         }

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             if (guess(mid) == -1) {
//                 end = mid - 1;
//             } else if (guess(mid) == 1) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }

//         }
//         return 0;
//     }
// }