package Leetcode;
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int sum = 0;

        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int index = 1; index < nums.length; index++) {
                sum = nums[index] + num;
                if (i < index) {
                    if (sum == target) {
                        arr = new int[] { i, index };
                        return arr;
                    }
                }
            }
        }
        return null;
    }
}