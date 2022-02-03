package Leetcode;
// import java.util.ArrayList;
// import java.util.List;

// // https://leetcode.com/problems/spiral-matrix

// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> ls = new ArrayList<Integer>();

//         // No of rows
//         int m = matrix.length;
//         // No of columns
//         int n = matrix[0].length;

//         int top = 0;
//         int bottom = m - 1;
//         int left = 0;
//         int right = n - 1;

//         while (top <= bottom && left <= right) {
//             // Top
//             for (int i = left; i <= right; i++) {
//                 ls.add(matrix[top][i]);
//             }

//             // Right
//             for (int i = top + 1; i <= bottom; i++) {
//                 ls.add(matrix[i][right]);
//             }

//             // Bottom
//             if (top != bottom) {
//                 for (int i = right - 1; i >= left; i--) {
//                     ls.add(matrix[bottom][i]);
//                 }
//             }

//             // Left
//             if (left != right) {
//                 for (int i = bottom - 1; i > top; i--) {
//                     ls.add(matrix[i][left]);
//                 }
//             }

//             top++;
//             bottom--;
//             left++;
//             right--;
//         }

//         return ls;
//     }
// }


// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> list = new ArrayList<>();

//         int i = 0;
//         int j = 0;

//         for (i = 0; i < 1; i++) {
//             for (j = 0; j < matrix[i].length - 1; j++) {
//                 list.add(matrix[i][j]);
//             }
//         }

//         for (i = 0; i < matrix.length; i++) {
//             for (j = matrix[i].length - 1; j < matrix[i].length; j++) {
//                 list.add(matrix[i][j]);
//             }
//         }

//         for (i = matrix.length - 1; i > 1; i--) {
//             for (j = matrix[i].length - 2; j >= 0; j--) {
//                 list.add(matrix[i][j]);
//             }
//         }

//         for (i = matrix.length - 2; i < 2; i++) {
//             for (j = 0; j < matrix[i].length - 1; j++) {
//                 list.add(matrix[i][j]);
//             }
//         }

//         return list;
//     }
// }