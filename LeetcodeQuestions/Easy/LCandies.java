package LeetcodeQuestions.Easy;

import java.util.ArrayList;
import java.util.List;

public class LCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> ans = findingCandies(candies, extraCandies);
        return ans;

    }

    static ArrayList<Boolean> findingCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i <= candies.length - 1; i++) {
            if (candies[max] < candies[i]) {
                max = i;
            }
        }

        for (int i = 0; i <= candies.length - 1; i++) {
            if (candies[i] + extraCandies >= candies[max]) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}