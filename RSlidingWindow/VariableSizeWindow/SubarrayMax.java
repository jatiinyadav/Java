package RSlidingWindow.VariableSizeWindow;

public class SubarrayMax {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int sum = 5;

        int max = Integer.MIN_VALUE;

        int ans = 0;
        while (i < arr.length && j < arr.length) {

            ans += arr[j];

            if (ans < sum) {
                j++;
            } else if (ans == sum) {
                int temp = j - i + 1;
                max = Math.max(temp, max);
                j++;
            } else if (ans > sum) {
                while (ans > sum) {
                    ans -= arr[i];
                    i++;
                }

                if (sum == ans) {
                    int temp = j - i + 1;
                    max = Math.max(temp, max);
                }

                j++;
            }

        }

        System.out.println(max);
    }
}
