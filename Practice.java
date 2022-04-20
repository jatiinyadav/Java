import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        int ans = search(arr, 0, arr.length / 2);

        if (ans == -1) {
            ans = search(arr, arr.length / 2 + 1, arr.length);
        }
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end) {

        int res = -1;

        if (arr[end] != arr[end - 1] || arr[end] != arr[end + 1]) {
            return arr[end];
        }

        for (int i = end; i >= 0; i-=2) {
            if (arr[end] != arr[end - 1]) {
                return arr[end];
            }
        }

        return res;

    }
}