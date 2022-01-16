package DLoops;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner inputTemp = new Scanner(System.in);

        float tempinC = inputTemp.nextFloat();

        float tempinF = (tempinC * 1.8f) + 32;
        inputTemp.close();

        System.out.println("Temp in F is: " + tempinF);
    }
}
