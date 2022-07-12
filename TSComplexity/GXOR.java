package TSComplexity;

public class GXOR {
    public static void main(String[] args) {

        // Calculate XOR from 0 to ans;
        int ans = 7;
        System.out.println(xor(ans));

        // Calculate xor from range1 to range2
        int range1 = 3;
        int range2 = 9;

        System.out.println(xor(range2) ^ xor(range1 - 1));

    }

    public static int xor(int n) {

        if (n % 4 == 0) {
            return n;
        }

        if (n % 4 == 1) {
            return 1;
        }

        if (n % 4 == 2) {
            return n + 1;
        }

        return 0;
    }
}
