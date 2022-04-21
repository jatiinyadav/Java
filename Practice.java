import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int[] arr1 = { 10, 2, 5, 3};

        for (int i = 0; i <= arr1.length - 1; i++){
            for (int j = 0; j <= arr1.length - 1; j++){
                if(arr1[i] == arr1[j] * 2){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}