package JRecursion.MustDoProblems;

public class BFibonacciN {
    public static void main(String[] args) {

        int num = 4;
        int ans = fibo(num - 1);
        System.out.println(ans);

    }

    public static int fibo(int num) {
        if (num <= 1) {
            return 1;
        }

        int left = fibo(num - 1);
        int right = fibo(num - 2);

        return left + right;
    }
}
