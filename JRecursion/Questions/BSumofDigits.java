package JRecursion.Questions;

public class BSumofDigits {
    public static void main(String[] args) {
        
        int number = 2408;
        int ans = sumofDigits(number);
        System.out.println(ans);

    }

    static int sumofDigits(int number) {
        
        if(number == 0){
            return 0;
        }
        return (number % 10) + sumofDigits(number / 10);
    }
}
