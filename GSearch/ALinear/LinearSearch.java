package GSearch.ALinear;
public class LinearSearch {
    public static void main(String[] args) {
        int[] num = { 2, 5, 1, 7, 4, -1, };

        int target = 1;

        int start = 1;
        int end = 4;

        int ans = linearSearch(num, target, start, end);
        System.out.println(ans);
    }

    static int linearSearch(int[] num, int target, int start, int end) {

        if (num.length == 0) {
            return -1;
        }

        for(int i = start; i < num[end]; i ++){
            if(num[i] == target){
                return i;
            }
        }

        return Integer.MAX_VALUE;

    }
}