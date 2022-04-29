import java.util.Arrays;
// import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int[] arr = { 2, 0, 2, 1, 1, 0 };
        product(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void product(int[] arr) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){

            switch(arr[mid]){
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
            
                case 2: 
                    int tem = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = tem;
                    high--;
                    break;    
            }

        }

    }

}
