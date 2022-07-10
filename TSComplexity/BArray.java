package TSComplexity;

public class BArray {
    public static void main(String[] args) {

        // Given an array, where elements are appearing twice except one
        // Find the element that is appearing once;

        int[] arr = { 2, 4, 1, 3, 2, 3, 4 };

        // We can XOR the whole array because
        // a ^ a = 0;

        // All the same elements will get XOR and will be zero
        // At the end only one element will be remaining

        int xor = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            xor = xor ^ arr[i];
        }

        // System.out.println(xor);

        System.out.println(10 ^ 10 ^ 0);
    }
}
