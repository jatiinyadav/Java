public class Practice {
    public static void main(String[] args) {

        int number = 10;
        boolean ans = result(number);
        System.out.println(ans);

    }

    static boolean result(int number){
        if(number <= 9){
            return true;
        }
        return number == palindrone(number);

    }

    static int rev = 0;
    static int palindrone(int number){


        if(number == 0){
            return 1;
        }

        int rem = number % 10;
        rev = rev * 10 + rem;
        palindrone(number / 10);
        return rev;
    }

}