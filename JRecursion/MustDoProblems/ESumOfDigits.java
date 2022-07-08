package JRecursion.MustDoProblems;

public class ESumOfDigits {
    public static void main(String[] args) {

        int num = 12345;
        sum(num);
        System.out.println(sum1);

    }

    static int sum1 = 0;

    public static void sum(int num) {

        if (num == 0)
            return;

        int reve = num % 10;
        sum1 += reve;

        sum(num / 10);
    }

}
