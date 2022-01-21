package EMethods;
import java.util.Scanner;

public class Return {

    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);

        String name = name();
        System.out.println(name);
    }
    
    static int sum() {
        System.out.println("Enter 2 Numbers: ");
        try (Scanner input = new Scanner(System.in)) {
            int num1, num2, sum;
            num1 = input.nextInt();
            num2 = input.nextInt();
            sum = num1 + num2;
            return sum;
        }
    }
    
    static String name(){
        System.out.print("Enter Your Name: ");
        try (Scanner input = new Scanner(System.in)) {
            String name = input.nextLine();
            return name;
        }
    }
}
