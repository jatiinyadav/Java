package Leetcode;
public class InsertPos {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 8, 9 };
        int target = 3;

        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {

        int i = 0;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        if (i == nums.length) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if(target > nums[j]){
                    return j + 1;
                }
            }
        }

        return 0;

    }
}
