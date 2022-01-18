import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int ans = 0;

            while(true){

                System.out.print("Enter operator: ");
                char op = input.next().trim().charAt(0);

                if(op == '+' || op == '-' || op == '/'){
                    
                    int n1 = input.nextInt();
                    int n2 = input.nextInt();


                    if(op == '+'){
                        ans = n1 + n2;
                    }
                    if(op == '-'){
                        ans = n1 - n2;
                    }
                    if(op == '/'){
                        ans = n1 / n2;
                    }
                } else{
                    System.out.println("Incorrect Operator");
                    break;
                }

                System.out.println(ans);
                
            }
        }
    }
}
