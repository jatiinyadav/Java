package DLoops.Questions;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // Using another variable
        // int max = n1;

        // if(n2 > max){
        // max = n2;
        // }
        // if(n3 > max){
        // max = n3;
        // }

        // System.out.print("The max number is: " + max);

        // Without using another variable
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("Max: " + n1);
            } else{
                System.out.println("Max: " + n3);
            }
        }
        else {
            if (n2 > n3) {
                System.out.println("Max: " + n2);
            } else {
                System.out.println("Max: " + n3);
            }
        }
        
        input.close();
    }
}
