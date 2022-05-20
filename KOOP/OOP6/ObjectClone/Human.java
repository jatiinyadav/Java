package KOOP.OOP6.ObjectClone;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr = { 2, 4, 1, 6 };

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // To use clone function we have to add (throws CloneNotSupportedException)
    // This is Shallow Copy
    // public Object clone() throws CloneNotSupportedException {
    // return super.clone();
    // }

    // This is Deep Copy
    public Object clone() throws CloneNotSupportedException {

        Human twin = (Human) super.clone();

        // Make a deep copy
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
