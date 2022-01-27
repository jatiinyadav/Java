package FArrays;
// When you don't know how much the size of array will be we use ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class DArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(list.get(i));
        // }

        System.out.println(list);
        
        input.close();
    }
}