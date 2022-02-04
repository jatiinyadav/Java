// package Leetcode.Easy;

// // https://leetcode.com/problems/find-smallest-letter-greater-than-target

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {

//         if (letters[letters.length - 1] <= target || target < letters[0]) {
//             return letters[0];
//         }

//         int start = 0;
//         int end = letters.length - 1;

//         while (start + 1 < end) {

//             int mid = start + (end - start) / 2;

//             if (letters[mid] <= target) {

//                 start = mid;

//             } else {
//                 end = mid;
//             }

//         }

//         return letters[end];

//     }
// }