package EMethods.Questions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        prime(number);
        input.close();
    }

    static void prime(int number) {

        int count = 0;
        
        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                System.out.println("Not A Prime Number");
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("A Prime Number");
        }

    }

}
