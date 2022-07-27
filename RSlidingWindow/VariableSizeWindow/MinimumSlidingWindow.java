package RSlidingWindow.VariableSizeWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSlidingWindow {
    public static String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }

        String ans = "";

        int i = 0;
        int j = 0;

        int count = mp.size();

        int maxLen = Integer.MAX_VALUE;

        int maxStart = Integer.MIN_VALUE;
        int maxEnd = Integer.MIN_VALUE;

        while (j < s.length()) {

            if (mp.get(s.charAt(j)) != null) {
                mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) - 1);
                if (mp.getOrDefault(s.charAt(j), 0) == 0) {
                    count--;
                }
            }

            if (count > 0) {
                j++;
            } else if (count == 0) {
                while (count == 0) {

                    if (maxLen > j - i + 1) {

                        maxLen = j - i + 1;
                        maxStart = i;
                        maxEnd = j;

                    }
                    if (mp.containsKey(s.charAt(i))) {
                        mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
                        if (mp.getOrDefault(s.charAt(i), 0) == 1) {
                            count++;
                        }

                    }
                    i++;
                }

                j++;
            }

        }

        if (maxStart >= 0) {
            for (int q = maxStart; q <= maxEnd; q++) {
                ans += s.charAt(q);
            }
        } else {
            return "";
        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(minWindow("cabwefgewcwaefgcf", "cae"));

    }
}