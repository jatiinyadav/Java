public class Practice {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 7, 9 };
        int target = 19;
        int ans = sortedArray(arr, target, 0);
        System.out.println(ans);
    }

    static int sortedArray(int[] arr, int target, int start) {

        if (start == arr.length - 1) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        } else {
            return sortedArray(arr, target, start + 1);
        }

    }

}