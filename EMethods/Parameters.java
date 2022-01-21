package EMethods;
import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter Your First & Last Name: ");
            String firstName = input.next();
            String lastName = input.next();

            String greets = greet(firstName, lastName);
            System.out.println(greets);
        }
    }

    static String greet(String firstName, String lastName){
        
        String greeting = "Hello " + firstName + " " + lastName + "!!";

        return greeting;
    }
}
