package KOOP.OOP1.One;

public class Basic {
    public static void main(String[] args) {
        Copy ex1 = new Copy("Jatin", 21);
        // The (Copy ex1) This executes at the compile time
        // The new Copy("Jatin", 21) executes at the run time (DMA)

        // We are not making a copy of an object
        // We are making a copy of reference variable
        Copy ex2 = ex1;
        ex2.age = 20;

        // Thus changes done on ex2 will reflect int the ex1
        // System.out.println(ex1.age);
        // System.out.println(ex2.age);

        Copy ex3 = new Copy(ex1);
        System.out.println(ex3.name);
    }
}
