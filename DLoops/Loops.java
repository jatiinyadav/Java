package DLoops;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;

        // While Loop
        while (count != 6) {
            if (count < 5) {
                System.out.print(" " + count);
            } else {
                System.out.println(" " + count);
            }
            count++;
        }

        System.out.println("------------");

        // For loop
        // for (int newCount = 1; newCount != 6; newCount++) {
        // System.out.print(" " + newCount);
        // }

        // Question
        int number = 1;

        System.out.print("Enter limit: ");
        int limit = input.nextInt();

        // while (number <= limit);
        // {
        //     number += 2;
        //     System.out.print(" " + number);
        // }

        // Do while
        do {
            System.out.print(" " + number);
            number += 2;
        } while (number <= limit);

        input.close();
    }
}
