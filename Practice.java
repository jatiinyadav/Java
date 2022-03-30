import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int number = 6;
        int ans = factorial(number);
        System.out.println(ans);

    }

    static int factorial(int number) {

        int ans = 1;
        for(int i = number; i > 0; i--){
            ans = i * ans;
        }

        return ans;

    }
}