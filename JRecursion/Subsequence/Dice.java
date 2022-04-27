package JRecursion.Subsequence;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {

        System.out.println(dice("", 3));

    }

    static ArrayList<String> dice(String p, int target) {

        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }  

        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ArrayList<String> ans = dice(p + i, target - i);
            res.addAll(ans);
        }

        return res;
    }
}
