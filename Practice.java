public class Practice {
    public static void main(String[] args) {

        int[] nums = { 2, 2, 1, 1, 1, 2, 2};
        int count = 0;
        // int candidate = 0;
        
        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = i; j <= nums.length - 1; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        
        System.out.print(count);

    }
}