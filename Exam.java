import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam {
    public static void main(String[] args) {

        String ans = reverseWords("i.like.this.program.very.much");
        System.out.println(ans);
    }

    static String reverseWords(String S) {
        String[] arr = S.split("\\.");

        System.out.println(Arrays.toString(arr));

        String ans = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
            if (i > 0)
                ans += ".";
        }

        return ans;
    }
}