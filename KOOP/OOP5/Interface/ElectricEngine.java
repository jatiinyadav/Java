package KOOP.OOP5.Interface;

public class ElectricEngine implements Engine {
 
    public void start() {
        System.out.println("Electric Engine Started");
    }

    public void stop() {
        System.out.println("Electric Engine Stopped");
    }

    public void acc() {
        System.out.println("Electric Engine Accelerated");
    }
    
}
