package TSComplexity;

public class DNumbers {
    public static void main(String[] args) {

        // Range of Numbers Formula
        // For n bits
        // -2 ^ n - 1 to 2 ^ n - 1 + 1

        int[] nums = {};
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            if (((nums[i] >> i) & 1) == 1)
                sum++;
            sum %= 3;
            res = res | sum << i;

        }

        // Negative Binary Numbers
        // 1 byte = 8 bits

        // 10 -> 0 0 0 0 1 0 1 0
        // The first bit from the left represents whether the number is +ve or -ve
        // 0 -> positive | 1 -> negative
        // In 1 byte of 8 bits we can store numbers from -128 to 127
        // -0 = 0

        // How? -0 = 0
        // 0 0 0 0 0 0 0 0
        // Take 1s Compliment and add 1 in it

        // 0 0 0 0 0 0 0 0
        // 1 1 1 1 1 1 1 1
        // ---------------
        // 1 0 0 0 0 0 0 0 0
        // We can only store 8 bits in one byte, hence 1 will be discarded
        // - 0 = 0

        // 10 = 0 0 0 0 1 0 1 0
        // 2's Compliment of 10 will be
        // -10 = 1 1 1 1 0 1 1 0

        // 2's Compliment can be calculated as
        // 1. Take Compliment of that number
        // 2. Add the number with 1

        // 1 0 0 0 0 0 0 0 0
        // - 0 0 0 0 1 0 1 0

        // Compliment of 1 0 0 0 0 0 0 0 0
        // 1 1 1 1 1 1 1 1 1

        // So we can get 1 0 0 0 0 0 0 0 0 using 1 1 1 1 1 1 1 1 + 1

        // - 10 = 1 1 1 1 1 1 1 1 - 0 0 0 0 1 0 1 0 + 1

        // - 10 = 1 1 1 1 0 1 1 0
    }
}
