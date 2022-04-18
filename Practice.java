import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int[] candies = new int[] { 12, 1, 12 };
        int max = maxNumber(candies);
        ArrayList<Boolean> ans = runnningSum(candies, 10, max);
        System.out.println(ans);
    }

    static int maxNumber(int[] candies) {
        int max = 0;

        for (int i = 0; i <= candies.length - 1; i++) {
            if (candies[max] < candies[i]) {
                max = i;
            }
        }

        return max;
    }

    static ArrayList<Boolean> runnningSum(int[] candies, int extraCandies) {

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