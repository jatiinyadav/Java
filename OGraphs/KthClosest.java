package OGraphs;

import java.util.HashMap;
import java.util.Map;

public class KthClosest {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 3, 2, 2, 4 };

        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (mp.get(arr[i]) == null) {
                mp.put(1, arr[i]);
            } else {
                mp.put(mp.get(arr[i]) + 1, arr[i]);

            }

            mp.put(arr[i], count + 1);
        }

        mp.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }
}