// https://leetcode.com/problems/palindrome-number

// class Solution {
//     public boolean isPalindrome(int x) {

//         int originalNumber = x;
//         int rev = 0;
//         int rem = 0;

//         while (x > 0) {
//             rem = x % 10;
//             x = x / 10;
//             rev = (rev * 10) + rem;
//         }

//         return originalNumber == rev;

//     }
// }