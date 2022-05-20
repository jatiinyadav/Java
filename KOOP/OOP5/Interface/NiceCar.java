package KOOP.OOP5.Interface;

public class NiceCar {

    private Engine engine;
    private CDPlayer media = new CDPlayer();

    NiceCar() {
        engine = new PowerEngine();
    }

    void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

    void eStart() {
        engine.start();
    }

    void eStop() {
        engine.stop();
    }

    void mStart() {
        media.start();
    }

    void mStop() {
        media.stop();
    }
}
