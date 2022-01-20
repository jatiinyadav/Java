package DLoops;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int day = input.nextInt();

            String work = input.next();
            // String fruit = input.next();
            // switch(fruit){
            // case "apple":
            // System.out.println(" 1. The fruit is: " + fruit);
            // break;
            // case "banana":
            // System.out.println("2. The fruit is: " + fruit);
            // break;
            // case "mango":
            // System.out.println(" 3. The fruit is: " + fruit);
            // break;
            // default:
            // System.out.println("The default fruit is: " + fruit);
            // break;
            // }

            switch (day) {
                case 1 -> System.out.print("Monday");
                case 2 -> {
                    System.out.print("Tuesday");
                    switch (work) {
                        case "IT" -> System.out.print("Today' Work : IT");
                    }
                }
                case 3 -> System.out.print("Wednesday");
                case 4 -> System.out.print("Thrusday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("Satday");
                case 7 -> System.out.print("Sunday");
                default -> System.out.println("Enter Valid Day");
            }
        };
    }
}
