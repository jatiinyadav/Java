public class Practice {
    public static void main(String[] args) {

        int[] arr = { 935, 1231, 91 };
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = 0;

            while (arr[i] > 0) {
                int last = arr[i] % 10;
                arr[i] /= 10;
                sum += last;
            }

            int flag = 0;
            while (sum > 9) {
                int last = sum % 10;
                sum /= 10;
                ans += last;
                flag = 1;
            }

            if (flag == 1) {
                ans += sum;
            }

            ans = Math.max(ans, sum);
        }

        System.out.println(ans);

    }
}