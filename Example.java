// Practice Question, NOT ON LEETCODE

public class Example {
    public static void main(String[] args) {

        int number = 40;
        double ans = nrm(number);
        System.out.printf("%.3f", ans);

    }

    static double nrm(int number) {

        double n = number;
        double ans = 0;

        while(true){
            ans = 0.5 * (n + (number/n));

            if(Math.abs(ans - n) < 1){
                break;
            }

            n = ans;
        }

        return ans;

    }

}