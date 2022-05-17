package KOOP.Interface;

public interface Engine {

    static void hello(){
        System.out.println("I am static Engine");
    }

    void start();
    void stop();
    void acc();
    
}
