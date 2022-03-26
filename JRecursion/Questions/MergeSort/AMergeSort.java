package JRecursion.Questions.MergeSort;

// Solved using creating nre array object using copyOfRange

import java.util.Arrays;

public class AMergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 2 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        // Original Array is not being modified by default it creates a new array and copies 
        // elements of the original array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {

        int[] merged = new int[first.length + second.length];
        
        int i = 0 , j = 0, k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        if(i < first.length){
            merged[k] = first[i];
            i++; 
            k++;
        }

        if(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;
    }
}
