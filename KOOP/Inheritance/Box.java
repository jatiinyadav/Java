package KOOP.Inheritance;

class Box {

    double l;
    double w;
    double h;

    static String func() {
        return "Hello I am static";
    }

    Box() {
        super();
        System.out.println("Box Running");
    }

    Box(double size) {
        this.l = size;
        this.w = size;
        this.h = size;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

}
