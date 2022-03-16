// https://leetcode.com/problems/majority-element
// Use Boyr Moohre's Voting Algorithm

// class Solution {
//     public int majorityElement(int[] nums) {

//         int count = 0;
//         int candidate = 0;

//         for (int num : nums) {
//             if (count == 0)
//                 candidate = num;
//             if (num == candidate)
//                 count += 1;
//             else
//                 count -= 1;

//         }
//         return candidate;
//     }
// }

// Using Brute Force Approach
// class Solution {
//     public int majorityElement(int[] nums) {
        
//         int count1 = 0;
//         int count2 = 0;
//         int candidate = nums[0];

//         for (int i = 0; i <= nums.length - 1; i++) {
//             count2 = 0;
//             for (int j = i; j <= nums.length - 1; j++) {
//                 if (nums[i] == nums[j]) {
//                     count2++;
//                 }
//             }
//             if (count1 <= count2) {
//                 count1 = count2;
//                 candidate = nums[i];
//             }  
//         }
        
//         return candidate;
//     }
// }