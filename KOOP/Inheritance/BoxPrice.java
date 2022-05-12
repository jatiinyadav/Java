package KOOP.Inheritance;

class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice(){
        System.out.println("This is Box Price Class");
    }

    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }


}
