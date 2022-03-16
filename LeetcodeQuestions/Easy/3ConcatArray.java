// https://leetcode.com/problems/concatenation-of-array/

// Better Solution
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] newArray = new int[nums.length + nums.length];
//         int k = nums.length;

//         for (int i = 0; i <= nums.length - 1; i++) {
//             newArray[i] = nums[i];
//             newArray[k] = nums[i];
//             k++;
//         }
//         return newArray;
//     }
// }

// Optimal Solution
// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] newArray = new int[nums.length * 2];
//         for (int i = 0; i < nums.length; i++) {
//             newArray[i] = newArray[i + nums.length] =  nums[i];
//         }
//         return newArray;
//     }
// }