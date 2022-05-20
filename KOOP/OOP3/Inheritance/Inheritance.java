package KOOP.OOP3.Inheritance;

public class Inheritance {
    public static void main(String[] args) {

        // Every class has Object as is superclass
        // The Parent class extends the Object class by default

        // The left hand class can be a parent class
        // b1 is the reference variable to parent class
        // But object is being created of the child class which is BoxWeight
        // BoxWeight should contain all the properties that Box Class has
        Box b1 = new BoxWeight(1, 2, 3, 10);
        System.out.println(b1.w);

        // We cannot access weight here because Box clas doesn't have weight property
        // We can only properties/variables or anything that is present in Box Class
        // only
        // System.out.println(b1.weight);

        BoxPrice b3 = new BoxPrice(1, 2, 3, 20, 100);
        System.out.println(b3.hello);

    }
}
