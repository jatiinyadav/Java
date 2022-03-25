package JRecursion.Questions.Arrays;

import java.util.ArrayList;

public class DReturnArrayListWithoutArgument {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 2, 8, 2 };
        int target = 2;
        ArrayList<Integer> ans = linearSearch(arr, target, 0);
        System.out.println(ans);
    }
    
    static ArrayList<Integer> linearSearch(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        
        // This is will contain ans of that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = linearSearch(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
