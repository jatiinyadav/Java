package JRecursion.Questions.Leetcode;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 4;
        int ans = binarySearch(nums, 0, nums.length - 1, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] nums, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        int ans = -1;

        if (nums[mid] < target) {
            ans = binarySearch(nums, mid + 1, end, target);
        } else {
            ans = binarySearch(nums, start, mid - 1, target);
        }

        return ans;
    }
}
