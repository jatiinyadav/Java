package Leetcode;

class Solution {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        int sign = 1;

        if (x == 0)
            return 0;

        if (x < 0) {
            sign = -1;
            x = sign * x;
        }

        while (x > 0) {

            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            rem = x % 10;
            x = x / 10;
            rev = (rev * 10) + rem;
        }

        return rev * sign;
    }
}