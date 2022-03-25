package JRecursion.Questions.Arrays;

import java.util.ArrayList;

public class BLinearSearch {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = { 1, 4, 8, 2, 8, 5, 8, 9, 10, 8 };

        linearSearchPrintArray(arr, target, 0);
        System.out.print(list);
        // boolean ans = linearSearchReturnBooleanValue(arr, target, 0);
        // System.out.println(ans);

        // int ans = linearSearchReturnIndexValue(arr, target, 0);
        // System.out.println(ans);

    }

    // This will return all the index of the target element
    static ArrayList<Integer> list = new ArrayList<>();

    static void linearSearchPrintArray(int[] arr, int target, int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        linearSearchPrintArray(arr, target, index + 1);

    }

    static int linearSearchReturnIndexValue(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearSearchReturnIndexValue(arr, target, index + 1);
        }

    }

    // static boolean linearSearchReturnBooleanValue(int[] arr, int target, int
    // start) {

    // if(start == arr.length){
    // return false;
    // }

    // return arr[start] == target || linearSearch(arr, target, start + 1) ;
    // }
    static boolean linearSearchReturnBooleanValue(int[] arr, int target, int start) {

        if (start == arr.length) {
            return false;
        }
        if (arr[start] == target) {
            return true;
        } else {
            return linearSearchReturnBooleanValue(arr, target, start + 1);
        }

    }
}
