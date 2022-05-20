package KOOP.OOP5.Interface;

public class Main {
    // Interfaces contain abstract functions,
    // by default functions are public and
    // variables are static and final.

    public static void main(String[] args) {

        NiceCar car = new NiceCar();

        car.eStart();
        car.eStop();
        car.mStart();
        car.upgradeEngine();
        car.eStart();
        car.eStop();
        car.mStop();
    }
}
