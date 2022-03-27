public class Practice {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        boolean ans = sortedArray(arr, 0);
        System.out.println(ans);
    }

    static boolean sortedArray(int[] arr, int start){
        if(start == arr.length - 1){
            return true;
        }

        if(arr[start] == start + 1){
            return sortedArray(arr, start + 1);
        } else {
            return false;
        }
    }

}