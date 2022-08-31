package KOOP.OOP5.Interface;

public interface Engine {

    // Static Interface Method will always have a body
    // Because static method cannot be overidden, and
    // Interface methods are need to be overridden.
    // Call via the interface name
    static void method() {
        System.out.println("Static Engine method");
    }

    

    void start();

    void stop();

    void acc();
}
