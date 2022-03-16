public class Practice {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 1, 2, 2, 2 };
        int count1 = 0;
        int count2 = 0;
        int candidate = nums[0];

        for (int i = 0; i <= nums.length - 1; i++) {
            count2 = 0;
            for (int j = i; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count2++;
                }
            }
            if (count1 < count2) {
                count1 = count2;
                candidate = nums[i];
            }
        }

        System.out.print(candidate);

    }
}