package TSComplexity;

public class AEvenOdd {
    public static void main(String[] args) {

        // Given a number, find whether it is even or odd

        int a = 10;
        // a & 0 = 0;

        // a & 1
        // 1011011
        // 0000001 (1)
        // -------
        // 0000001

        // If a & 1 == 1, means the number is odd
        // If a & 1 == 0, means the number is even

        System.out.println(a & 1); // 0
        System.out.println(11 & 1); // 1
    }
}
