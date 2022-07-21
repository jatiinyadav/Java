package Questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    static void para(String p, String ans, List<String> res, int open, int close) {

        if (open == 0 && close == 0) {
            res.add(ans);
            return;
        }

        if (open > 0) {
            para("(", ans + "(", res, open - 1, close);
        }
 
        if (close > open) {
            para(")", ans += ")", res, open, close - 1);
        }

    }

    public static void main(String[] args) {

        List<String> ans = new ArrayList<>();

        para("(", "", ans, 3, 3);

        System.out.println(ans);
    }
}
