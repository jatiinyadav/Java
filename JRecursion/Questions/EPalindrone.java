package JRecursion.Questions;

public class EPalindrone {

    static int rev = 0;
    static int reverse(int number){

        if(number == 0){
            return 1;
        }
        int rem = number % 10;
        rev = rev * 10 + rem;
        reverse(number / 10);
        return rev;
    }
    static boolean palindrone(int number){
        return number == reverse(number);
    }

    public static void main(String[] args) {
    
        int number = 1001;
        boolean result = palindrone(number);
        System.out.println(result);
    }
    
}
