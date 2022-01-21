package EMethods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter 2 Numbers: ");

            int a = input.nextInt();
            int b = input.nextInt();

            swapping(a, b);
            // int output = swapping();
            // System.out.println(output);
        }
    }
    
    static void swapping(int a, int b){
        
        int temp = a;
        a = b;
        b = temp;


        System.out.println(a + " " + b);
    }
}
