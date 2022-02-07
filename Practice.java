public class Practice {
    public static void main(String[] args) {

        int[] letters = { 2, 4, 6, 8, 10, 14, 18 };

        int target = 2;

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        System.out.println((letters[start]));
    }
}