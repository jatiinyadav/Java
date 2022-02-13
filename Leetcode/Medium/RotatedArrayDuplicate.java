// https://leetcode.com/problems/search-in-rotated-sorted-array

// class Solution {
//     public int search(int[] nums, int target) {

//         int start = 0;
//         int end = nums.length - 1;

//         int piv = pivot(nums);
//         if (piv == -1) {
//             return binarySearch(nums, target, start, end);
//         }
//         if (nums[piv] == target) {
//             return piv;
//         }

//         if (nums[0] <= target) {
//             return binarySearch(nums, target, start, piv - 1);
//         }
//         return binarySearch(nums, target, piv + 1, end);
//     }

//     // IT WILL WORK IN THE CASE OF DUPLICATE VALUES
//     int pivot(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (mid < end && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             if (mid > start && arr[mid] < arr[mid - 1]) {
//                 return mid - 1;
//             }
            // if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
            //     if(arr[start] > arr[piv + 1]){
            //         return start;
            //     }
            //     start++;
            //     if(arr[end] < arr[end - 1]){
            //         return end -1;
            //     }
            //     end--;
            // } 

            // REFER BINARY SEARCH VIDEO QUESTION 9
//         }

//         return -1;

//     }

//     int binarySearch(int[] nums, int target, int start, int end) {

//         int ans = -1;

//         while (start <= end) {

//             int mid = start + (end - start) / 2;

//             if (nums[mid] < target) {
//                 start = mid + 1;
//             } else if (nums[mid] > target) {
//                 end = mid - 1;
//             } else {
//                 ans = mid;
//                 return ans;
//             }
//         }

//         return ans;
//     }
// }