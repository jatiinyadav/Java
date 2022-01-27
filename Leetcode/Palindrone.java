package Leetcode;
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        int rem = 0;

        if (x > 0) {
            while (x > 0) {
                rem = x % 10;
                x = x / 10;
                rev = (rev * 10) + rem;
            }
        }

        else{
            while (x < 0) {
                rem = x % 10;
                x = x / 10;
                rev = (rev * 10) + rem;
            }
        }

        return rev == original;
    }
}