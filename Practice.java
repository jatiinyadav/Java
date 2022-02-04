public class Practice {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 9 };

        int start = 0;
        int end = arr.length - 1;

        int target = 5;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (arr[mid] == target) {
                System.out.println(mid);
            }

        }

    }
}