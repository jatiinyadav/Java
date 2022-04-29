package JRecursion.Questions.Leetcode;

// import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        int n = 3;
        int ans = fibonacci(n, 0, 1, 1);
        System.out.println(ans);
    }

    static int fibonacci(int n, int start, int next, int index) {

        if (index == n) {
            return next;
        }

        int temp = next + start;
        start = next;
        next = temp;

        int ans = fibonacci(n, start, next, index + 1);
        return ans;
    }
}
