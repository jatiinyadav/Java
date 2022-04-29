package FArrays.Leetcode;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr = { -1, -1 };
        arr[0] = firstLast(nums, 8, true);
        if (arr[0] != -1) {
            arr[1] = firstLast(nums, 8, false);
        }

        System.out.println(Arrays.toString(arr));
    }

    static int firstLast(int[] arr, int target, boolean index) {

        int start = 0;
        int ans = -1;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (index) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }
}
