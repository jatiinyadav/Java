import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void sumK(int[] arr, int k, List<List<Integer>> ans, List<Integer> list, int index) {

        if (index == arr.length) {
            if (k == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (arr[index] <= k) {
            list.add(arr[index]);
            sumK(arr, k - arr[index], ans, list, index + 1);
            list.remove(list.size() - 1);
        }

        sumK(arr, k, ans, list, index + 1);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        int k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sumK(arr, k, ans, list, 0);
        System.out.println(ans);
    }
}