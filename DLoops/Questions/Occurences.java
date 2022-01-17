package DLoops.Questions;
public class Occurences {
    public static void main(String[] args) {
        int number = 10000000;

        int count = 0;

        while(number > 0){
            int rem = number % 10;
            if (rem == 0) {
                count++;
            }
            number = number / 10;
        }

        System.out.print("Occurences: " + count);
    }
}
