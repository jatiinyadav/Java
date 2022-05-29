package JRecursion.Subsequence;

import java.util.ArrayList;

public class AllSubsets {
    public static void main(String[] args) {

        ArrayList<String> ans  = subsetsReturn("abc", "");
        // subsets("abc", "");
        System.out.println(ans);

    }

    static void subsets(String example, String ans) {
         if (example.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = example.charAt(0);
        subsets(example.substring(1), ans + ch);
        subsets(example.substring(1), ans);
    }

    // Returning ArrayList
    static ArrayList<String> subsetsReturn(String example, String ans) {
        if (example.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = example.charAt(0);
        ArrayList<String> left = subsetsReturn(example.substring(1), ans + ch);
        ArrayList<String> right = subsetsReturn(example.substring(1), ans);

        left.addAll(right);
        return left;
    }

}
