package DLoops;

public class Basics{
    public static void main(String[] args){
        int count = 1;

        while (count != 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("-------");

        for(int newCount = 1; newCount != 5; newCount++){
            System.out.println(newCount);
        }
    }
}