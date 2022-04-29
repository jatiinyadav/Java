package FArrays.Leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {

        int[] nums = { 2, 0, 1 };
        sortColors(nums);
        System.err.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            switch (nums[mid]) {

                // Number is 0
                case 0:
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;

                // Number is 1
                case 1:
                    mid++;
                    break;

                // Number is 2
                case 2:
                    int tem = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = tem;
                    high--;
                    break;
            }

        }

    }
}
