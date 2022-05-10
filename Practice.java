import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 4, 8, 5, 1, 7, 3 };

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr, int left, int right){

        if(left >= right){
            return;
        }

        int start = left;
        int end = right;
        int mid = start + (end - start) / 2;

        int pivot = arr[mid];

        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start<= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        sort(arr, left, end);
        sort(arr, start , right);
    }
}