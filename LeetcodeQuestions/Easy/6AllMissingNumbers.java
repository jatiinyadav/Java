// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
        
//         int start = 0;
//         int end = nums.length - 1;
        
//         while( start <= end ){
//             int correct = nums[start] - 1;
            
//             if(nums[start] != nums[correct]){
//                 int temp = nums[start];
//                 nums[start] = nums[correct];
//                 nums[correct]= temp;
//             } else {
//                 start++;
//             }
//         }
        
//         // Find missing Numbers
//         List<Integer> ans = new ArrayList<>();
//         for (int index = 0; index < nums.length; index++){
//             if(nums[index] != index + 1){
//                 ans.add(index + 1);
//             }
//         }
        
//         return ans;
//     }
// }