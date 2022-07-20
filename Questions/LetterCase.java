package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCase {

    public static void cases(char[] str, int pos, List<String> result) {

        if (str.length == pos) {
            System.out.println(Arrays.toString(str));
            result.add(new String(str));
            return;
        }

        if (Character.isLetter(str[pos])) {

            if (Character.isUpperCase(str[pos])) {
                str[pos] = Character.toLowerCase(str[pos]);

                cases(str, pos + 1, result);

                str[pos] = Character.toUpperCase(str[pos]);
            } else {
                str[pos] = Character.toUpperCase(str[pos]);

                cases(str, pos + 1, result);

                str[pos] = Character.toLowerCase(str[pos]);
            }

        }

        cases(str, pos + 1, result);

    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String s = "a1B2";
        cases(s.toCharArray(), 0, ans);
    }
}
