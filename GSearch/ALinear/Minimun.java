package GSearch.ALinear;
public class Minimun {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 8};

        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr) {

        int number = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < number ) {
                number = arr[i];
            }
        }

        return number;

    }
}
