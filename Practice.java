import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2 };
        int[] arr2 = { 4, 2, 5 };
        
        int[] smaller = arr1.length > arr2.length ? arr2 : arr1;
        System.out.println(Arrays.toString(smaller));

    }
}