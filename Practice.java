import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        String name = "a good   example";

        String res = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            res += name.charAt(i);
        }

        int j = 0;
        int start = 0;
        String ans = " ";
        while (j <= res.length() - 1) {

            if (res.charAt(j) == ' ' || j == res.length() - 1) {
                ans = ans + reverse(res, start, j) + " ";
                start = j + 1;
            }
            j++;

        }

        System.out.print(ans.trim().replaceAll(" +", " "));

    }

    static String reverse(String res, int start, int end) {

        String ans = "";
        for (int i = end; i >= start; i--) {
            ans += res.charAt(i);
        }

        return ans;
    }
}
