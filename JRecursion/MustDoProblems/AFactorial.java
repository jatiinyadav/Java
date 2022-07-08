package JRecursion.MustDoProblems;

public class AFactorial {
    public static void main(String[] args) {

        int fact = 10;
        int ans = factorial(fact, 1);
        System.out.println(ans);
    }

    public static int factorial(int fact, int sum) {

        if (fact == 1)
            return sum;

        return factorial(fact - 1, fact * sum);

    }
}
