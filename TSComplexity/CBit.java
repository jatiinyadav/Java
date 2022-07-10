package TSComplexity;

public class CBit {
    public static void main(String[] args) {


        // 1 byte  = 8 bits

        // Given a number find ith Bit of that number
        int a = 16;

        System.out.println((a & (1 << 4)));

        // Set the ith bit, turn it to 1
        int b = 10;

        System.out.println((b | (1 << 3)));

        // Reset ith bit
        // 1 -> 0
        // 0 -> 0

        int c = 21;

        System.out.println((c & (1 << (3))));

        // Find the position of the right most element

    }
}
