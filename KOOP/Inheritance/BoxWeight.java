package KOOP.Inheritance;

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        System.out.println("Running Box Weight Class");
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

}
