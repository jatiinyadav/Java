class Solution {
    public boolean canJump(int[] nums) {
        int lastJump = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastJump)
                lastJump = i;
        }
        return lastJump == 0;
    }
}