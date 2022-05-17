package KOOP.Interface;

public class Car implements Brake, Engine, Media {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }

    @Override
    public void brake() {
        System.out.println("Brake Applied");
    }

}
