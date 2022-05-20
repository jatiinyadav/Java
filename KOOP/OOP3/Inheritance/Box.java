package KOOP.OOP3.Inheritance;

public class Box {

    int l;
    int w;
    int h;
    int hello = 30;
    // Anything which is private we can use that thing only in that class
    private int example;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
        this.example = -1;
    }

    public void priva(){
        System.out.println(this.example);
    }

    Box(int side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(int l, int w, int h) {
        this.h = h;
        this.w = w;
        this.l = l;
    }
}
