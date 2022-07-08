package JRecursion.MustDoProblems;

public class DPalindrone {
    public static void main(String[] args) {

        int num = 101;
        palindrone(num);
        System.out.println(rev);

    }

    static int rev = 0;

    public static void palindrone(int num) {

        if (num == 0) {
            return;
        }

        int reve = num % 10;
        rev = rev * 10 + reve;

        palindrone(num / 10);

    }
}
