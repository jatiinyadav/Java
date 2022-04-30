package JRecursion.Leetcode;

public class PowerThree {
    public static void main(String[] args) {
        boolean ans = power(16);
        System.out.println(ans);
    }

    static boolean power(int n) {

        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        if (n % 2 != 0)
            return false;

        return power(n / 3);

    }
}
