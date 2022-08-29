package ZNagarro;

// https://www.geeksforgeeks.org/nagarro-interview-experience-set-5-pool-campus-drive/?ref=lbp

public class LongestSubsequence {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 9, 10, 11, 12, 35, 36, 37, 8, 9, 10, 21, 22 };

        int start = 0;
        int end = 0;

        int sum = 0;
        int answer = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (j < arr.length - 1) {
            if (Math.abs(arr[j + 1] - arr[j]) == 1) {
                sum += arr[j];
            } else {
                sum += arr[j];
                if (sum > answer) {
                    start = i;
                    end = j;
                    answer = sum;
                }
                sum = 0;
                i = j + 1;
            }
            j++;
        }

        System.out.println(answer + " start: " + start + " end: " + end);
    }
}
