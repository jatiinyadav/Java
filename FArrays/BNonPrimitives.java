package FArrays;
import java.util.Arrays;
import java.util.Scanner;

public class BNonPrimitives {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int limit = input.nextInt();

        String[] names = new String[limit];

        names(names, limit, input);

        input.close();
        
    }

    static void names(String[] names, int limit, Scanner input){

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter " + i + " String: ");
            names[i] = input.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
