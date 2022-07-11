package TSComplexity;

public class EMagicNumber {
    public static void main(String[] args) {

        int ans = 0;

        int n = 10;

        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n >>= 1;
            ans += base * last;
            base *= 5;
        }

        System.out.println(ans);

        int x = 0;
        do {
            x++;
            if (x == 2) {
                continue;
            }
        } while (x < 2);
        System.out.println(x);

        // Time Complexity is logN
    }
}
