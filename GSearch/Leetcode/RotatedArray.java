package GSearch.Leetcode;

public class RotatedArray {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int piv = pivot(nums, start, end);

        if (piv == -1) {
            return binarySearch(nums, start, end, target);
        }

        if (nums[piv] == target) {
            return piv;
        }

        if (nums[0] <= target) {
            return binarySearch(nums, start, piv - 1, target);
        }

        return binarySearch(nums, piv + 1, end, target);
    }

    public int pivot(int[] nums, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
