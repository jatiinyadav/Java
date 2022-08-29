import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(1);

        int ind = 0;

        int j = 1;

        Map<Integer, Integer> mp = new HashMap<>();

        int k = 2;
        while (j <= k) {

            int number = 0;
            if (arr.get(ind) > arr.get(ind + 1)) {
                number = arr.remove(ind + 1);
                arr.add(number);
                mp.put(arr.get(ind), mp.getOrDefault(arr.get(ind), 0) + 1);
            } else {
                number = arr.remove(ind);
                arr.add(number);
                mp.put(arr.get(ind + 1), mp.getOrDefault(arr.get(ind + 1), 0) + 1);
            }

            j++;
        }

        int maximum = 0;
        int number = 1;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (mp.getOrDefault(entry.getKey(), 0) > maximum) {
                maximum = mp.getOrDefault(entry.getValue(), 0);
                number = entry.getKey();
            }
        }

        System.out.println(number);
        int num;
    }
}