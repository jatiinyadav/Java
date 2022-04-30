import java.util.Arrays;
// import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 1 };
        System.out.println(product(arr, 5));
        System.out.println(Arrays.toString(arr));
    }

    static int product(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == target) {
                return start;
            }

            else if (nums[end] == target) {
                return end;
            }

            else if (nums[start] < target) {
                start++;
            }

            else if (nums[end] > target) {
                end--;
            }

            else {
                break;
            }
        }

        return -1;
    }
}
