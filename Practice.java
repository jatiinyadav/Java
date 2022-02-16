import java.util.Arrays;

// import java.util.Arrays;

// The worst case will be O(n^2)
// The best case will also be O(n^2)
//  Because we are finding the greatest element in the array
// It is not stable
// Use case is: It perform well in small lists/arrays
public class Practice {

    public static void main(String[] args) {

        int[] arr = { 5, 3, 4, 1, 2 };

        for (int i = 0; i <= arr.length - 2; i++) {
            sort(arr, 0, i + 1);
        }

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int start, int end) {

        for (int i = 0; i <= start; i++) {
            for (int j = end; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}