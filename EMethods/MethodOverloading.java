package EMethods;
// Function with same name can exist if they have different arguments
// The type should be different ex: String, int, char
// OR
// The number of arguments should be different

public class MethodOverloading {
    public static void main(String[] args) {

        // It decides at compile time which function to run
        func(23);
        func("Jatin Yadav");

        int sum = sum(10, 20, 40);
        int sum2 = sum(10, 20);
        System.out.println(sum);
        System.out.println(sum2);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void func(int a) {
        System.out.println(a);
    }

    static void func(String name) {
        System.out.println(name);
    }
}
