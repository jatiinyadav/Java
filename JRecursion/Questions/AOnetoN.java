package JRecursion.Questions;

public class AOnetoN {
    public static void main(String[] args) {
        int number = 5;
        int res = numbers(number);
        System.out.println(res);
    }

    // Factorial of a Number
    static int numbers(int number){
        if(number <= 1){
            return 1;
        }
        
        // Sum
        // int sum = number + numbers(number - 1);
        
        // Factorial 
        int fact = number * numbers(number - 1);
        return fact;
    }
    
}
