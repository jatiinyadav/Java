package EMethods.Assignment;

import java.util.Scanner;

public class AFirst {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        average(input);

    }

    static void average(Scanner inp) {

        int pos = 0, neg = 0, zer = 0;
        while (true) {

            System.out.print("Press 0 to end 1 to continue: ");
            int ans = inp.nextInt();

            if (ans == 1) {

                System.out.print("Enter number: ");
                int num = inp.nextInt();

                if (num > 0) {
                    pos++;
                }
                if (num < 0) {
                    neg++;
                }
                if (num == 0) {
                    zer++;
                }

            } else {
                System.out.println("Positive: " + pos);
                System.out.println("Negative: " + neg);
                System.out.println("Zeros: " + zer);
                return;
            }

        }

    }
}
