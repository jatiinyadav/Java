package DLoops.Questions;
import java.util.Scanner;

public class Alphabet{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        char character = input.next().trim().charAt(0);

        if(character >= 'a' && character <= 'z'){
            System.out.println("Character is lower case");
        } else {
            System.out.println("Character is upper case");
        }

        input.close();
    }
}