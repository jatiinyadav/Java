// https://leetcode.com/problems/find-peak-element/
// class Solution {
//     public int findInMountainArray(int target, MountainArray mountainArr) {
//         int start = 0;
//         int end = MountainArray.length();
        
//         while(start <= end){
            
//             int mid = start + (end - start)/2;
            
//             if(mountainArr[mid] > target){
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
            
//         }
        
//         return end;
//     }
// }