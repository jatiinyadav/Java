package CQuestions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();
        System.out.println("The sum is: " + (n1 + n2));
    }
}
