import java.util.Scanner;

public class Demo{
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        Scanner name = new Scanner(System.in);
        String nameHere = name.nextLine();
        name.close();
        
        System.out.println("Your name is " + nameHere);
    }
}