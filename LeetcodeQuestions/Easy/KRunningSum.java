package LeetcodeQuestions.Easy;

// https://leetcode.com/problems/running-sum-of-1d-array/submissions/

class Solution {
    public int[] runningSum(int[] nums) {

        for (int i = 1; i <= nums.length - 1; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;

    }

}