import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr = { 11, 15, 6, 8, 9, 10 };
        int sum = 16;

        int[] ans = { -1, -1 };

        int i;
        for (i = 0; i < arr.length - 1; i++) { 
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        int largest = i;
        int smallest = (i + 1) % arr.length;

        while (smallest != largest) {
            if (arr[smallest] + arr[largest] == sum) {
                ans[0] = smallest;
                ans[1] = largest;
            }

            if (arr[smallest] + arr[largest] < sum) {
                smallest = (smallest + 1) % arr.length;
            } else {
                largest = (arr.length + largest - 1) % arr.length ;
            }

        }

        System.out.println(Arrays.toString(ans));
    }
}