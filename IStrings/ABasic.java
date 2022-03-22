package IStrings;

import java.util.Arrays;

public class ABasic {
        public static void main(String[] args) {

                String name1 = "Jatin Yadav";
                String name2 = new String("Jatin Yadav");

                System.out.println((Arrays.toString(new int[] { -2, 0, 3, 10 })).getClass());

                System.out.println(name1.equals(name2));

        }
}