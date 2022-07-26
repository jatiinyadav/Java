package RSlidingWindow;

public class SubArraySum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 2, 1 };
        int targetSum = 3;

        int i = 0, j = 0, sum = 0;
        int max = Integer.MIN_VALUE;

        while (i < arr.length && j < arr.length) {
            sum = sum + arr[j];
            if (sum < targetSum) {
                j++;
            } else if (sum == targetSum) {
                int tempAns = j - i + 1;
                max = Math.max(max, tempAns);
                j++;
            } else if (sum > targetSum) {
                while (sum > targetSum) {
                    sum = sum - arr[i];
                    i++;
                }
                if (sum == targetSum) {
                    int tempAns = j - i + 1;
                    max = Math.max(max, tempAns);
                }
                j++;
            }
        }

        System.out.println(max);

    }
}
