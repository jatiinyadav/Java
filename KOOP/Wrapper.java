package KOOP;

public class Wrapper {
    public static void main(String[] args) {

        A random = new A("Jatin Yadav");
        System.out.println(random.name);

        A obj;

        obj = new A("MY anae");

        System.out.println(obj.name);
    }
}

class A {
    String name;

    A(String name) {
        this.name = name;
    }
}