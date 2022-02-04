// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> list = new ArrayList<Integer>();

//         int rows = matrix.length;
//         int columns = matrix[0].length;

//         int top = 0;
//         int bottom = rows - 1;
//         int left = 0;
//         int right = columns - 1;

//         int d = 0;

//         while (top <= bottom && left <= right) {

//             if (d == 0) {
//                 for (int i = left; i <= right; i++) {
//                     list.add(matrix[top][i]);
//                 }
//                 top++;
//                 d = 1;
//             } else if (d == 1) {
//                 for (int i = top; i <= bottom; i++) {
//                     list.add(matrix[i][right]);
//                 }
//                 right--;
//                 d = 2;
//             } else if (d == 2) {
//                 for (int i = right; i >= left; i--) {
//                     list.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//                 d = 3;
//             } else if (d == 3) {
//                 for (int i = bottom; i >= top; i--) {
//                     list.add(matrix[i][left]);
//                 }
//                 left++;
//                 d = 0;
//             }

//         }

//         return list;

//     }
// }