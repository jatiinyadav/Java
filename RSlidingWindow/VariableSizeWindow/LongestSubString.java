package RSlidingWindow.VariableSizeWindow;
import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1


public class LongestSubString {
    public int longestkSubstr(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();

        int i = 0;
        int j = 0;

        int ans = -1;

        while (j < s.length()) {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);

            if (mp.size() < k) {
                j++;
            } else if (mp.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
            } else if (mp.size() > k) {
                while (mp.size() > k && i < s.length()) {
                    mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) - 1);
                    if (mp.getOrDefault(s.charAt(i), 0) == 0) {
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
