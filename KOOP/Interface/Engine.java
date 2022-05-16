package KOOP.Interface;

public interface Engine {

    static void hello(){
        System.out.println("I am static Engine");
    }

    int hel = 3;

    void start();
    void stop();
    void acc();
    
}
