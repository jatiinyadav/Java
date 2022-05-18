package KOOP.OOP2;

public class Main {

    int age;
    static int num;
    static int a = 10;
    static int b;

    // This will execute everytime even if we create an object or not
    static {
        System.out.println("This is static block");
        b = a * 4;
    }

    Main(int age, int num) {
        this.age = age;
        Main.num += 1;
    }

    class Test {

    }

    public static void main(String[] args) {

        // Static variables can accessed without creating objects
        // System.out.println(Main.num);
        // System.out.println(Main.num);

        // The number of objects we create in this case the value of static num will
        // increase
        // The static variable num is common to all the objects
        // If one object changes the value of the static variable num, the change will
        // affects in all the objects
        //
        // Main ex1 = new Main(20, 30);
        // Main ex2 = new Main(50, 30);

        // Why main method is static?
        // Main method is 1st method that is being run by Java
        // If the main method is not static then it will be a normal class
        // and to use the methods in that class we have create object
        // But static doesn't depend on objects
        // So to run our Java Program main method should be static

        // In side a static method we cannot use a method or value that is not static
        // If we want to use a non static method in static then we have create an object

        // We cannot use this keyword in static method
        // Because this keyword depends on objects and static doesn't depends on objects

        // To perform calculations on static we can initialise a block

        // Singleton Class
        // Singleton single1 = Singleton.getInstance();
        // Singleton single2 = Singleton.getInstance();
        // Singleton single3 = Singleton.getInstance();
    }
}
