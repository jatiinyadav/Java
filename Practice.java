import java.util.Arrays;

// import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        // int[] ans = self(arr);
        int[] ans = constant(arr);
        System.out.println(Arrays.toString(ans));
        // System.out.println(Arrays.toString(arr));
    }

    static int[] constant(int[] arr) {

        int product = 1;

        int[] res = new int[arr.length];
        int n = arr.length;

        for (int i = 0; i <= arr.length - 1; i++) {
            res[i] = arr[i] * product;
            product *= arr[i];
        }

        product = 1;
        for (int j = n - 1; j > 0; j--) {
            res[j] = res[j - 1] * product;
            product *= arr[j];
        }
        res[0] = product;

        return res;
    }

    // Using 2 extra arrays Time Complexity is 0(N^2)
    static int[] self(int[] arr) {

        int[] answer = new int[arr.length];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            left[i] = left[i - 1] * arr[i];
        }

        int n = arr.length;
        right[n - 1] = arr[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            right[j] = right[j + 1] * arr[j];
        }

        answer[0] = right[1];
        answer[n - 1] = left[n - 2];

        for (int k = 1; k <= n - 2; k++) {
            answer[k] = left[k - 1] * right[k + 1];
        }

        return answer;
    }

}
