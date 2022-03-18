// https://leetcode.com/problems/missing-number

// Cycle Sort
// class Solution {
//     public int missingNumber(int[] nums) {

//         int start = 0;
//         int end = nums.length;

//         while (start < end) {
//             int correct = nums[start];

//             if (nums[start] < nums.length && nums[start] != nums[correct]) {
//                 int temp = nums[start];
//                 nums[start] = nums[correct];
//                 nums[correct] = temp;
//             } else {
//                 start++;
//             }
//         }

//         for (int index = 0; index < nums.length; index++) {
//             if (nums[index] != index) {
//                 return index;
//             }
//         }

//         return nums.length;

//     }
// }