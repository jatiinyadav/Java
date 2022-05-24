package KOOP.OOP3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism (A Greek Word)
        // Poly :- many
        // Morphism :- ways to represent

        // Many ways to represent a single entity or item
        // Any language that doesn't support Polymorphism,
        // that cannot be a Object Oriented Programming Language.

        // In all the classes below there is same function area()
        // Act of representing the same thing in multiple ways is Polymorphism

        // Types of Polymorphism

        // 1. Compile Time or Static Polymorphism
        // This is achieved by Method Overloading
        // Method Overloading: When a class has multiple methods with the same name,
        // the parameter, arguments, return type can be different.
        // Ex: Multiple Constructors
        // Know as compile time because Java determines which Constructor or method to,
        // call at the compile time.

        // 2. Dynamic or Run Time Polymorphism
        // This is achieved by Method Overriding
        // Method Overrriding: When the child class has the same name as the Parent
        // class,
        // exactly everything is same just the body is the different
        // Ex: Shapes class has sub class Circle, Cube, Square,
        // All the sub classes has the same name of the method as the Parent class have,
        // hence they will override the Parent class method.

        // If the sub class contains the method with the same name and if we call it,
        // the sub class method will run ans if doesn't contain the method with the same
        // name,
        // then the Parent class method will execute

        Shapes shapes = new Shapes();
        System.out.println(shapes);
        // Cirlce circle = new Cirlce();
        // Square square = new Square();
        Shapes cube = new Cube();

        // It will call the sub class or Cube class method

        cube.area();

        // We cann't override a method that is final.
        // We cann't inherit a class that is final.

        // All the static methods are inherited there is no point in overriding them in,
        // the child class because the static method in the parent class will always
        // run.
         // In simple words static methods can be inherited but cannot be overridden.
        // Overriding depends on objects, static doesn't depend on objects, hence static
        // methods cannot be overriden.
    }
}
