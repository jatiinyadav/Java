package OGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CycleDetectionDirectedDFS {
    public static void main(String[] args) {

        String str = "the quick brown fox jumps over the lazy dog";
        String string = str.replaceAll(" ", "");
        String message = "vkbs bs t suepuv";

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (!list.contains(string.charAt(i))) {
                list.add(string.charAt(i));
            }
        }

        String ans = ""; 

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put(list.get(i), (char) ('a' + i));
        }

        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) == ' ') {
                ans += " ";
            } else {
                char c = map.get(message.charAt(i));
                ans += c;
            }

        }

        System.out.println(ans);
    }
}
