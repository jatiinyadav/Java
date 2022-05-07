import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };
        // int[] res = new int[nums.length];

        // int start = 0;
        // int end = nums.length - 1;
        // int i = 0;

        // while (start <= end) {

        // if (nums[start] != 0) {
        // res[i] = nums[start];
        // i++;

        // }

        // start++;

        // }

        // for(int j = 0; j<= nums.length - 1; j++){
        // nums[j] = res[j];
        // }

        // System.out.println(Arrays.toString(res));

        int end = nums.length - 1;

        int left = 0;
        int right = 0;

        while (right <= end) {

            if (nums[right] == 0) {
                right++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right++;
            }

        }

        System.out.println(Arrays.toString(nums));

    }
}
