package LeetcodeQuestions.Easy;

import java.util.ArrayList;

class MTargetJava {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }

        int[] output = new int[nums.length];

        for (int j = 0; j < nums.length; j++) {
            output[j] = arr.get(j);
        }

        return output;

    }
}
