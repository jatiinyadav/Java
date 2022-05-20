package KOOP.OOP6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        // Object
        // Throwable
        // Exception--Error
        // Checked and Unchecked

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
            throw new ArithmeticException("");
        } 
        catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        } finally {
            System.out.println("Ended");
        }

    }
}
