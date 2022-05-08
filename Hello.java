class Solution {
    public String reverseWords(String s) {

        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }

        int j = 0;
        int start = 0;
        String ans = " ";
        while (j <= res.length() - 1) {

            if (res.charAt(j) == ' ' || j == res.length() - 1) {
                ans = ans + reverse(res, start, j) + " ";
                start = j + 1;
            }
            j++;

        }

        return ans;

    }

    public String reverse(String res, int start, int end) {

        String ans = "";
        for (int i = end; i >= start; i--) {
            ans += res.charAt(i);
        }

        return ans;
    }

}