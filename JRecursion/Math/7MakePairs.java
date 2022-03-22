// import java.util.Arrays;

// // Practice Question, NOT ON LEETCODE

// public class Example {
//     public static void main(String[] args) {

//         int[] arr1 = { 1, 3, 5, 7 };
//         int[] arr2 = { 2, 4, 6, 8 };
//         int[] ans = hcf(arr1, arr2);

//         System.out.println(Arrays.toString(ans));

//         int[] sort = cycleSort(ans);
//         System.out.println(Arrays.toString(sort));
//     }

//     static int[] hcf(int[] n1, int[] n2) {

//         int[] ans = new int[n1.length + n2.length];

//         int k = n1.length;
//         for (int i = 0; i < n1.length; i++) {
//             ans[i] = n1[i];
//             ans[k] = n2[i];
//             k++;
//         }

//         return ans;
//     }

//     static int[] cycleSort(int[] arr) {

//         int start = 0;
//         int end = arr.length;

//         while (start < end) {
//             int correct = arr[start] - 1;

//             if (arr[start] != arr[correct]) {
//                 int temp = arr[start];
//                 arr[start] = arr[correct];
//                 arr[correct] = temp;
//             } else {
//                 start++;
//             }
//         }

//         return arr;
//     }

// }