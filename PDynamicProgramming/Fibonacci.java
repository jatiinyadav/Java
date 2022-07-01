package PDynamicProgramming;

public class Fibonacci {

    public static int dp(int n, int[] ans) {

        if (n <= 1) {
            return n;
        }

        if (ans[n] != 0)
            return ans[n];

        return ans[n] = dp(n - 1, ans) + dp(n - 2, ans);

    }

    public static void main(String[] args) {

        int n = 8;
        int[] ans = new int[n + 1];

        System.out.println(dp(n, ans));

        // Optimised
        int nw = 8;

        int prev2 = 0;
        int prev = 1;
        int temp = 0;

        for (int i = 2; i <= nw; i++) {
            temp = prev + prev2;
            prev2 = prev;
            prev = temp;
        }

        System.out.println(temp);
    }
}
