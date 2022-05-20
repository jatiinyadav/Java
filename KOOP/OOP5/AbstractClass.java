package KOOP.OOP5;

public abstract class AbstractClass {

    // We need to declare the whole class as abstract if we want to,
    // make methods abstract in that class

    // We cannot create object of abstract class.
    // We cannot create abstract constructors.

    // Abstract Class doesn't have method body
    // The body of the Abstract Class is done by child classes
    // The child class must override the method.
    abstract String career(String name);

    // We can also create constructor of the abstract class
    AbstractClass() {

    }

    // We can create static methods inside an abstract class because:-
    // 1. We cannot create objects of abstract classes and static methods
    // doesn't depend on object.

    // A abstract class cannot be static because :-
    // 1. Static method cannot be overriden and abstract methods are a must to
    // be overridden.
    static void hello() {
        System.out.println("Greeetings");
    }

    // We cannot have final abstract class
    // Because final means no inheritance and abstract classes are need to
    // inherited.

}
