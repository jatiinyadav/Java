package EMethods;
public class BlockScope {
    public static void main(String[] args) {
        int a = 10;

        {
            int block = 30;
            System.err.println(block);
        }

        System.out.println(a);
    }
}

// Anything that is initialized outside can be used inside but cannot be initialized again
// Anything that is initialized inside cannot be used outside 
