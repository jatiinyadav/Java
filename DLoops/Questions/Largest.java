package DLoops.Questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Three Numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        ctoF(n1, n2, n3);
        input.close();
    }

    static void ctoF(int n1, int n2, int n3) {

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println(n1 + " is largest");
            } else {
                System.out.println(n3 + " is largest");
            }
        }

        else if (n2 > n3) {
            System.out.println(n2 + " is largest");
        }

        else {
            System.out.println(n3 + " is largest");
        }

    }
}