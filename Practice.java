public class Practice {
    public static void main(String[] args) {
        int number = 10;
        double ans = sqrt(number);
        System.out.printf("%.2f", ans);
    }

    static double sqrt(int number) {

        int start = 0;
        int end = number;

        double ans = 0.0;

        // When the given number is perfect square
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == number) {
                return mid;
            }

            if (mid * mid < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        // When the given number is not a perfect square
        for(int index = 0; index < 1; index++){
            while(ans * ans < number ){
                ans += 0.1;
            }
            ans -= 0.1;
        }

        return ans;
    }
}