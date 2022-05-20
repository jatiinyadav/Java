package KOOP.OOP3.Inheritance;

public class BoxPrice extends BoxWeight {

    int cost;

    BoxPrice(int l, int w, int h, int weight, int cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

}
