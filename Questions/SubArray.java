package Questions;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {

        int count = 0;

        int[] nums = { 1, 2, 3, 4, 6 };
        int ans = 0;
        int k = 7;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        for (int i = 1; i <= nums.length - 1; i++) {

            ans += nums[i];

            if (mp.containsKey(ans - k)) {
                count += mp.get(ans - k);
            }
            mp.put(ans, mp.getOrDefault(ans, 0) + 1);

        }

        System.out.println(count);
    }
}
