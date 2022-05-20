package KOOP.OOP7;

public class FrameworkEnumVector {

    // Enum
    enum Week {
        Mon, Tue, Wed, Thrus, Fri, Sat, Sun;
        // These are enum constants
        // public, static and final
        // since it is final you cannot create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // Constructor is executed separately for each enum
        // This constructor is not public or protected, only private and default
        // Because we don't want to create new objects
        // Internally is : public static final Week Mon = new Week;

        // enums type cannot extend another class
        // enums can implement an Interface
    }

    public static void main(String[] args) {

        // COLLECTION FRAMEWORK
        // Collection Framework is defined as the file which contains all the functions
        // that are
        // common in multiple Interfaces and Classes
        // For example .add(), .remove()
        // These all functions are common in LinkedList, ArrayList, Vector

        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new Vector<>();

        // VECTOR OBJECT
        // Multithreading is a Java feature that allows concurrent execution of two 
        // or more parts of a program for maximum utilization of CPU. Each part of 
        // such program is called a thread.
        // In Vector Object more than one threads cannot point to one Vector Object,
        // Whereas in ArrayList one or more threads can access one ArrayList Object
        // If one thread is accessing the object and another thread wants to access,
        // the object then it will wait till thread one completes its process
        // Therefore ArrayList is more faster than Vector

        // ENUMERATIONS (ENUMS)
        // Group of variables which cannot be changed
        // It is a special data type that enables for a variable to be set of predefined
        // constants
        // Week week = Week.Mon;
        // Week week3 = Week.Tue;

        // System.out.println(week3.ordinal());
        // Ordinal Gives the index of the value
    }
}
