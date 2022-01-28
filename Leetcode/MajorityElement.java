package Leetcode;
// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {

        int res = 0, count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[res] == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        return nums[res];
    }
}