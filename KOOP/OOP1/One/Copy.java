package KOOP.OOP1.One;

public class Copy {
    int age;
    String name;

    Copy(Copy other){
        this.age = other.age;
        this.name = other.name;
    }

    Copy(String name, int age){
        this.name = name;
        this.age = age;
    }
}
