package Leetcode;


import java.util.Arrays;

public class Expression {
    public static void main(String[] args) {

        int[] numbers = new int[]{};
        int target = 1;
        int[] result = match(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] match(int[] nums, int target) {

        int[] arr = new int[2];
        int i = 0;

        if (nums.length == 0) {
            arr = new int[]{-1, -1};
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == target) {
                        arr[1] = j;
                    }
                }
                return arr;
            }
        }


        if (i == nums.length) {
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;

    }
}