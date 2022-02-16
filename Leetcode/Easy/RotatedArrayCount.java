// // Find the Rotation Count in Rotated Sorted Array
// package Leetcode.Easy;

// public class RotatedArrayCount {
//     public static void main(String[] args) {
        
//         int[] arr = {15, 18, 2, 3, 6, 12};

//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end){

//             int mid = start + (end - start) / 2;

//             if(arr[mid] > arr[mid + 1]){
//                 end = mid;
//             } else {
//                 start = mid + 1;
//             }

//         }

//         System.out.println(start);
        
//     }
// }
