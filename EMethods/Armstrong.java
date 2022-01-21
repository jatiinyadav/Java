package EMethods;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter a number: ");

        // int number = input.nextInt();
        // armstrong(number);

        // Print All the 3 digit Armstrong Number
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(" " + i );
            }
        }
        input.close();

    }

    static boolean armstrong(int number) {
        int originalNumber = number;
        int rem = 0;
        int sum = 0;

        while (number > 0) {
            rem = number % 10;
            number = number / 10;
            sum = (rem * rem * rem) + sum;
        }
        
        return originalNumber == sum;
    }
}