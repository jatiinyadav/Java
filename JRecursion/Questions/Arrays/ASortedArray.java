package JRecursion.Questions.Arrays;

// NOTE:If you modify the array in the recursion call the array will be modified for all the recursion calls 

// Check whether the array is sorted or not
// Index : 0 1 2 3 4 5
// Numb:   1 2 3 4 5 6

public class ASortedArray {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 6 ,7, 3 };
        boolean ans = checkArray(arr, 0);
        System.out.println(ans);
    }

    static boolean checkArray(int[] arr, int start) {

        if (start == arr.length - 1) {
            return true;
        }

        // if (arr[start] < arr[start + 1]) {
        //     return checkArray(arr, start + 1);
        // }
        // return false;

        // or

        return arr[start] < arr[start + 1] && checkArray(arr, start + 1);
    }
}
