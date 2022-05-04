package GFG.Arrays;

import java.util.Arrays;

public class GivenSumPair {
    public static void main(String[] args) {

        int[] nums = { 11, 15, 6, 8, 9, 10 };
        int sum = 9;

        int[] ans = {-1, -1};

        int i;
        for(i = 0; i <= nums.length - 2; i++){
            if(nums[i] > nums[i + 1]){
                break;
            }
        }

        int smallest = (i + 1) % nums.length;
        int largest = i;

        while(smallest != largest){

            if(nums[smallest] + nums[largest] == sum){
                ans[0] = smallest;
                ans[1] = largest;
            }

            if(nums[smallest] + nums[largest] < sum){
                smallest = (smallest + 1) % nums.length;
            } else {
                largest = (nums.length + largest - 1) % nums.length;
            }

        }

        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));

    }
}
