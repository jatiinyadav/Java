package GSearch.ALinear;
public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 5, 4 }, { 5, 9, 7 }, { 65, 27, 84, 15 }
        };

        // SEARCH FOR AN ELEMENT
        // int target = 54;
        // System.out.println(Arrays.toString(in2DArray(arr, target)));

        // SEARCH FOR MAX NUMBER
        System.out.println(maximum(arr));
    }

    // SEARCH FOR AN ELEMENT
    // static int[] in2DArray(int[][] arr, int target) {

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // if (arr[i][j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }

    // return new int[] { -1, -1 };

    // }

    // FIND MAX VALUE
    static int maximum(int[][] arr) {

        int max = arr[0][0];

        for(int[] element : arr){
            for (int element2: element) {
                if (max < element2) {
                    max = element2;
                }
            }
        }

        return max;
    }
}
