package JRecursion.Questions;

public class DReverse {
    public static void main(String[] args) {
        int number = 109;
        reverse(number);
        System.out.println(rev);
    }
    
    static int rev = 0;
    static void reverse(int number) {

        if(number == 0){
            return;
        }

        int rem = number % 10;
        rev = rev * 10 + rem;
        reverse(number / 10);
    }
    

}
