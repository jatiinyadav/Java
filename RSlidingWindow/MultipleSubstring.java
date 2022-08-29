package RSlidingWindow;

import java.util.*;

public class MultipleSubstring {
    public static void main(String[] args) {

        String str = "hellololeeewee";

        Map<Character, Integer> mp = new HashMap<>();

        ArrayList<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        int i = 0;
        int j = 0;

        int k = 2;

        int ans = 0;

        int maxSize = 0;

        while (j < str.length()) {
            mp.put(str.charAt(j), mp.getOrDefault(str.charAt(j), 0) + 1);
            if (mp.size() < k) {
                j++;
            } else if (mp.size() == k) {
                if (j - i + 1 >= ans) {
                    String res = "";
                    for (int l = i; l <= j; l++) {
                        res += str.charAt(l);
                    }
                    q.add(res);
                    maxSize = Math.max(maxSize, res.length());
                    ans = j - i + 1;
                }
                j++;
            } else if (mp.size() > k) {
                while (mp.size() > k && i < str.length()) {
                    mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0) - 1);
                    if (mp.getOrDefault(str.charAt(i), 0) == 0) {
                        mp.remove(str.charAt(i));
                    }
                    i++;
                }
                if (j - i + 1 == ans) {
                    String res = "";
                    for (int l = i; l <= j; l++) {
                        res += str.charAt(l);
                    }
                    q.add(res);
                    maxSize = Math.max(maxSize, res.length());
                }
                j++;
            }
        }

        while(!q.isEmpty()){
            String str1 = q.poll();
            if(str1.length() == maxSize){
                result.add(str1);
            }
        }

        System.out.println(result);

    }
}
