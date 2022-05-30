import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int ans = fibonacci(5);
        System.out.println(ans);
    }

    static int fibonacci(int size) {
        if (size <= 1) {
            return size;
        } else {
            int f = fibonacci(size - 1) + fibonacci(size - 2);
            return f;
        }
    }

}