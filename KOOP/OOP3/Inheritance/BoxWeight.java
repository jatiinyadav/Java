package KOOP.OOP3.Inheritance;

public class BoxWeight extends Box {

    int weight;

    BoxWeight(int l, int w, int h, int weight) {

        // Box class must contain a constructor that accepts 3 parameters
        // It is calling the parent class constructor that accepts 3 parameters,
        // if there is no constructor in the Parent class that accepts 3,
        // parameters then it will give an error

        // super keyword points just above class
        // super initialised in BoxWeight will point to Box class
        // which is just above it
        super(l, w, h);

        // if we want to access explicitly the variable of super class
        // int sClass = super.l;

        this.weight = weight;
    }

}
