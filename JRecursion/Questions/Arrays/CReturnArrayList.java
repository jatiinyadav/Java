package JRecursion.Questions.Arrays;

import java.util.ArrayList;

public class CReturnArrayList {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 8, 4, 7, 4 };
        int target = 4;

        ArrayList<Integer> ans = linearSearch(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> linearSearch(int[] arr, int target,int index,  ArrayList<Integer> list) {

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
    
        return linearSearch(arr, target, index + 1, list);
    }

}
