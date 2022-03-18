// https://leetcode.com/problems/first-missing-positive/

// class Solution {
//     public int firstMissingPositive(int[] nums) {

//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {

//             int correct = nums[start] - 1;

//             if (nums[start] > 0 && nums[start] <= nums.length && nums[start] != nums[correct]) {
//                 int temp = nums[start];
//                 nums[start] = nums[correct];
//                 nums[correct] = temp;
//             } else {
//                 start++;
//             }

//         }

//         for (int index = 0; index < nums.length; index++) {
//             if (nums[index] != index + 1) {
//                 return index + 1;
//             }
//         }

//         return nums.length + 1;
//     }
// }