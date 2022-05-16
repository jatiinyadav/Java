package KOOP.Interface;

public interface Media {

    static void hello(){
        System.out.println("I am static Media");
    }
    
    void start();
    void stop();

}
