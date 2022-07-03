public class Example {

    public static long robber(int[] nums, boolean res) {

        long[] arr = new long[nums.length + 1];

        int start = 1;
        int end = nums.length - 1;
        if (res) {
            arr[0] = nums[0];
            end = nums.length - 2;
        } else {
            arr[1] = nums[start];
            start = 2;
        }

        for (int i = start; i <= end; i++) {
            long left = nums[i];
            if (i > 1) {
                left += arr[i - 2];
            }
            long right = arr[i - 1];

            arr[i] = Math.max(left, right);
        }

        return arr[end];
    }

    public static long houseRobber(int[] valueInHouse) {

        long res1 = robber(valueInHouse, true);
        long res2 = robber(valueInHouse, false);

        return Math.max(res1, res2);
    }

    public static void main(String[] args) {

        int[] valueInHouse = { 1, 2, 3, 1 };
        long ans = houseRobber(valueInHouse);

        System.out.println(ans);
    }
}