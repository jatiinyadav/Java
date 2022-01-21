package EMethods.Questions;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int innumber = input.nextInt();
        int reverse = palindrone(innumber);

        if (innumber == reverse) {
            System.out.println("Number is Palindrone");
        } else {
            System.out.println("Not a Palindrone");
        }

        input.close();
    }

    static int palindrone(int number){

        int rem = 0;
        int reverse = 0;

        while (number > 0) {
            rem = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + rem;
        }

        return reverse;
    }
}
