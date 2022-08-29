package ZNagarro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/nagarro-interview-experience-set-5-pool-campus-drive/?ref=lbp
// https://www.geeksforgeeks.org/nagarro-interview-experience-set-3-campus/?ref=lbp

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaAaBBaa";
        Map<Character, Integer> mp = new HashMap<>();

        String pq = str.toLowerCase();

        for (int q = 0; q < pq.length(); q++) {
            mp.put(pq.charAt(q), mp.getOrDefault(pq.charAt(q), 0) + 1);
        }

        if (mp.size() == 2) {
            System.out.println("True");
        } else {
            System.out.println(mp.size());
            System.out.println("False");
        }

        String myStr = "abcd abc abcde abcdef";
        String[] arr = myStr.split("\\s+");

        System.out.println(Arrays.toString(arr));

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 0) {
                ans += arr[i].substring(0, arr[i].length() / 2) + " ";
                ans += arr[i].substring(arr[i].length() / 2) + " ";

            } else {
                ans += arr[i] + " ";
            }
        }

        System.out.println(ans);

    }
}
