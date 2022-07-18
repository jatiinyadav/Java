package Questions;

public class BinarySearch {

    public static int findPeakElement(int[] nums) {

        if (nums.length == 1)
            return 0;

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < end) {

                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                }

                if (nums[mid] > nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

            if (mid == 0) {
                if (nums[mid] > nums[mid + 1])
                    return mid;
                else
                    return 1;
            }

            if (mid == nums.length - 1) {
                if (nums[mid] > nums[mid - 2])
                    return mid;
                else
                    return nums.length - 2;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 3, 2 };
        System.out.println(findPeakElement(nums));

    }

}
// Binary Search on Reverse Sorted Array

// Order Agnoistic Binary Search
// Here order of the Binary Search is Not Given

// First and Last Position of an Element

// Find the number of occurences of an element
// https://leetcode.com/discuss/interview-question/algorithms/124724/Find-count-of-a-number-in-sorted-array

// Number of times Array is rotated
// https://practice.geeksforgeeks.org/problems/rotation4723/1

// Find an element in rotated and sorted array
// https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/

// Searching in nearly sorted array
// https://www.geeksforgeeks.org/search-almost-sorted-array/

// Floor in a sorted array
// https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

// Ceiling in a sorted array
// https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/

// Next Alphabetic Element
//

// Next Greater Element
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// Find position of an element in infinte sorted array (Two Pointer)
// https://
// www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// https://leetcode.com/discuss/interview-experience/1979273/infinite-sorted-array

// Find the index of 1st one in Binary Sorted Array
// https://www.geeksforgeeks.org/find-index-first-1-infinite-sorted-array-0s-1s/

// Minimum Difference Element in a Sorted Array

// Binary Search can be also be applied on Unsorted Array

// Find peak element
// https://leetcode.com/problems/find-peak-element/

// Find max element in Bitonic Array
// Bitonic:-> Monotonically Strictly increasing and Monotonically Strictly


// Search an element in Bitonic Array
// 
