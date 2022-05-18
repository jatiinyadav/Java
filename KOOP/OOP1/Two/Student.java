package KOOP.OOP1.Two;

public class Student {
    String name;
    int roll;
    float marks;

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return this.name + " " + this.marks;
    }

}
