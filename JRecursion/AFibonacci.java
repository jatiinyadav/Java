package JRecursion;

public class AFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println("Java QA");
    }

    static int fibonacci(int num) {

        if (num < 2) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

}