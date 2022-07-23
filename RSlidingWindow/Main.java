package RSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Problems
    // Fixed Sized Window
    // 1. Max/Min sub array of size k
    // 2. Ist -ve in every window of size k
    // 3. Count occurences of anagram
    // 4. More of all the subarray of size k
    // 5. Max of min for every window size

    // Variable Sized Window
    // 1. Largest/Smallest subarray with sum k
    // 2. Largest Substring with k distinct character
    // 3. Length of largest substring with no repeating charcters
    // 4. Pick a toy
    // 5. Minimum Window Substring

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);

        int[] arr1 = new int[arr.size()];

        int k = 4;

        arr1[0] = arr.get(0);
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = arr1[i - 1] + arr.get(i);
        }

        long max = arr1[k - 1];
        int j = k - 1;
        int i = 1;

        while (j < arr1.length - 1) {
            max = Math.max(max, (arr1[j++] - arr1[i - 1]));
            i++;
        }

        System.out.println(max);
        System.out.println(Arrays.toString(arr1));
    }

}

// Negative Integer in every window of size k
// https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1