// package Leetcode;
// // https://leetcode.com/problems/richest-customer-wealth

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int sum = 0;
//         int maxSum = 0;

//         for (int i = 0; i < accounts.length; i++) {
//             sum = 0;
//             for (int j = 0; j < accounts[i].length; j++) {
//                 sum = sum + accounts[i][j];
//             }
//             if(maxSum < sum){
//                 maxSum = sum;
//             }
//         }

//         return maxSum;
//     }
// }