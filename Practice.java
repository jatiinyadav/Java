public class Practice {
    public static void main(String[] args) {

        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 12;
        int ans = binarySearch(nums, 0, nums.length - 1, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] nums, int start, int end, int target) {

        if(start == end && nums[start] == target){
            return start;
        }

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, end, target);
        } else {
            return binarySearch(nums, start, mid - 1, target);
        }

    }

}
