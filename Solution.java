import java.util.*;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        mp.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            System.out.println();
            if (entry.getValue() > 1) {
                ans.add(entry.getKey());
            }
        });

        if (ans.size() == 0) {
            ans.add(-1);
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 17, 27, 11, 23, 14, 29, 17, 24, 3, 6, 18, 8, 18, 16, 29, 11, 24, 5, 0, 1, 28, 3, 28, 4, 13, 7, 7,
                27, 10, 21 };
        ArrayList<Integer> ans = duplicates(arr, arr.length);
        System.out.println(ans);

    }
}