// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// class Solution {
//     public int[] searchRange(int[] nums, int target) {

//         int[] arr = { -1, -1 };

//         arr[0] = searchNumber(nums, target, true);

//         if (arr[0] != -1) {
//             arr[1] = searchNumber(nums, target, false);
//         }
//         return arr;

//     }

//     int searchNumber(int[] nums, int target, boolean index) {

//         int ans = -1;
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             if (nums[mid] < target) {
//                 start = mid + 1;
//             } else if (nums[mid] > target) {
//                 end = mid - 1;
//             } else {
//                 ans = mid;
//                 if (index) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }

//         }

//         return ans;

//     }
// }