package KOOP.Clone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Human jatin = new Human("Jatin", 21);
        // Human yadav = new Human(jatin);

        // Shallow Copy
        // Means A new object will be created but if the object contains Primitives Data types
        // it will refer to the same variable, it wil create a copy
        // But in the case of Non-Primitive it will point to the same value. For ex: Array 
        Human yadav = (Human) jatin.clone();

        yadav.arr[0] = 20;

        System.out.println(Arrays.toString(yadav.arr));
        System.out.println(Arrays.toString(jatin.arr));
    }
}
