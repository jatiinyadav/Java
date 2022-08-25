import java.util.*;

public class Practice {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            mp.put(arr2[i], mp.getOrDefault(arr2[i], 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < arr1.length; j++) {
            count = 0;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                if (entry.getKey() <= arr1[j]) {
                    count += mp.getOrDefault(entry.getKey(), 0);
                }
            }
            ans.add(count);
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 7, 9};
        int[] arr2 = {0, 1, 2, 1, 1, 4};

        ArrayList<Integer> res = countEleLessThanOrEqual(arr1, arr2, 2, 2);
        System.out.println(res);

    }
}