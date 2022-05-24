package KOOP.OOP2;

public class Singleton {
    // If we want only one object to be created of a class, this is know as
    // SingletonClass

    Singleton() {

    }

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
