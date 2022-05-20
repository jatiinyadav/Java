package KOOP.OOP6.ObjectClone;

import java.util.Arrays;

// If a class is using .clone() method then the function should have 
// CloneNotSupportedException

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human h1 = new Human(23, "Jatin");

        // Clone will actually copy all the object values from one object to another
        // (Human) is the type casting used
        Human h2 = (Human) (h1.clone());

        // Shallow Copy 
        // In shallow copy the reference variables of non-primitives type will be same;
        // Changes made in arr of h2 will also reflect in arr of h1;

        h2.arr[0] = 10;
        h2.age = 19;
        
        // int is the primitive data type so the reference variables are different
        // so the values will not change
        System.out.println(h1.age);
        System.out.println(h2.age);

        // The values of both the arrays will be same
        System.out.println(Arrays.toString(h1.arr));
        System.out.println(Arrays.toString(h2.arr));

        // Deep Copy
        // In deep copy it doesn't matter whether there are primitives data type or not
        // it will copy all the items and the reference variable will be different
    }
}
