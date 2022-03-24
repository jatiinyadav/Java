import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] result = makepairs(arr1, arr2);
        System.out.print(Arrays.toString(result));
    }

    static int[] makepairs(int[] arr1, int[] arr2) {

        int[] array = new int[arr1.length + arr2.length];

        for (int i = 0; i <= arr1.length - 1;i++) {

            array[i] = arr1[i];

            for (int j = i+ 1; j <= i; j++){
                array[j] = arr2[j];
            }
        }

        return array;
    }

}   