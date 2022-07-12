package TSComplexity;

public class FPascal {
    public static void main(String[] args) {

        // int row = 2;

        // System.out.println((int) Math.pow(2, row - 1));

        // System.out.println(1 << row - 1);

        // Power of a^b
        // Brute force
        int ans = 1;
        int b = 6;
        for (int i = b; i >= 1; i--) {
            ans *= 3;
        }
        System.out.println(ans);

        // Bit Manipulation

        int base = 3;
        int power = 6;

        int res = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                res *= base;
            }
            base *= base;
            power >>= 1;

        }

        System.out.println(res);

        // Count the number of set bits in a given number;
        int number = 234;
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }

        System.out.println(count);
    }
}
