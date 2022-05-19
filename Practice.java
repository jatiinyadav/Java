public class Practice {
    public static void main(String[] args) {

        int num = 14;
        System.out.println(numSteps(num, 0));

    }

    static int numSteps(int num, int steps){
        if(num == 0){
            return steps;
        }

        if(num % 2 == 0){
            return numSteps(num / 2, steps + 1);
        }

        return numSteps(num - 1, steps + 1);
    }

}
