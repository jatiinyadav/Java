package KOOP.Interface;

public class NiceCar {
    
    private Engine engine;
    private Media music = new CDPlayer();
    private Brake brake = new Car();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void musicStart(){
        music.start();
    }

    public void musicStop(){
        music.stop();
    }

    public void brakeA(){
        brake.brake();
    }

}
