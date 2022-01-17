package DLoops.Questions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print the Fibonacci Series
        // int number = input.nextInt();
        int a = 0;
        int b = 1;

        System.out.print(" " + a + " " + b);

        for(int i = 1; i < 9; i++){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println("Enter nth number: ");
        // Fibonacci Number at nth position
        int nth = input.nextInt();

        int p = 0;
        int q = 1;
        int count = 2;
        int temp = 0;

        while(count <= nth){
            temp = p + q;
            p = q;
            q = temp;
            count++;
        }

        System.out.println(q);

        input.close();
    }
}
