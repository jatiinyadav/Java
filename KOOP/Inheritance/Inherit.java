package KOOP.Inheritance;

public class Inherit {

    public static void main(String[] args) {

        Box obj1 = new Box(4.3, 5.4, 7.1);
        // System.out.println(obj1.h + " " + obj1.l + " " + obj1.w);

        BoxWeight box1 = new BoxWeight(3.4, 3.5, 2.7, 8);
        // System.out.println(box1.weight);

        BoxPrice box2 = new BoxPrice();

    }

}
