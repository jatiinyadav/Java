package Questions;

import java.util.ArrayList;

public class BitBinary {

    static void bin(int N, int one, int zero, ArrayList<String> ans, String str) {
        if (N == 0) {
            ans.add(str);
            return;
        }

        if (N > 0) {
            bin(N - 1, one + 1, zero, ans, str + 1);
        }

        if (one > zero) {
            bin(N - 1, one, zero + 1, ans, str + 0);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> ans = new ArrayList<>();
        bin(3, 0, 0, ans, "");
        System.out.println(ans);
    }
}
