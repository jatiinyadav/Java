public class Practice {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 6, 8 };
        // int[] arr = {3, 6, 12, 15, 18, 20, 25, 50 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                System.out.println(mid + 1);
                break;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                System.out.println(mid);
                break;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

    }
}