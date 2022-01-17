package DLoops.Questions;


import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        input.close();

        if (salary >= 10000) {
            salary += 2000;
        }
        else {
            salary += 1000;
        }

        System.out.print("Your new salary is: " + salary);
    }
}
