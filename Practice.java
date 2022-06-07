import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Practice {
    public static void main(String[] args) {

        int[] nums = { 7, 9, 7, 4, 2, 8, 7, 7, 1, 5 };

        int start = 0;
        int end = nums.length - 1;
        List<Integer> ans = new ArrayList<>();

        // [4, 3, 2, 7, 8, 2, 3, 1]

        // while (start <= end) {
        //     int correct = nums[start] - 1;

        //     if (nums[start] != nums[correct]) {
        //         int temp = nums[start];
        //         nums[start] = nums[correct];
        //         nums[correct] = temp;
        //     } else {
        //         start++;
        //     }
        // }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != i + 1) {
                System.out.println(nums[i]);
                break;
            }
        }

    }
}