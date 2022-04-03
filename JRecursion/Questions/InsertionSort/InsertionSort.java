package JRecursion.Questions.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        int[] arr = {9, 5, 8, 1, 7, 3};
        insertionSort(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int[] arr, int start, int end){

        int index = end;

        if(end == arr.length){
            return;
        }

        while(start < index){
            if(arr[index] < arr[index - 1]){
                int temp = arr[index - 1];
                arr[index - 1] = arr[index];
                arr[index] = temp;
            } else {
                break;
            }
            index--;

        }

        insertionSort(arr, 0, ++end);

    }
}
