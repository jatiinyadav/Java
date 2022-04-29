package FArrays.Leetcode;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int r = arr.length;
        int c = arr[0].length;

        int[] row = new int[r];
        int[] col = new int[c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(row[i] == 1|| col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
