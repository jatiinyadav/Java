package FArrays;
import java.util.Arrays;
import java.util.Scanner;

public class C2DArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];

        arr2d(array, input);
    }

    static void arr2d(int[][] array, Scanner input){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }

        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }

        // Better Way
        for(int[] result : array){
            System.out.println(Arrays.toString(result));
        }
    }
}
