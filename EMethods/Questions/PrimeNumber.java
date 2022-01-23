package EMethods.Questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n1 = input.nextInt();
        System.out.println(ctoF(n1));
        input.close();
    }

    static boolean ctoF(int n1) {

        int i = 0;
        for (i = 2; i <= n1 / 2; i++) {
            if (n1 % i == 0) {
                System.out.println(i);
                break;
            }
        }
        return i > n1 / 2;
    }
}