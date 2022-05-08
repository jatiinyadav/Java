package KOOP;

public class Basic {
    public static void main(String[] args) {

        Student jatin = new Student(20, "Jatin Yadav", 20.3f);

        Student random = new Student(jatin);

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

    }
}

class Student {

    float marks;
    String name;
    int rno;

    // Constructor without parameters
    // Student() {
    // this.name = "Jatin Yadav";
    // this.rno = 23;
    // this.marks = 23.5f;
    // }

    // Other Object as parameter
    Student(Student other) {
        this.marks = other.marks;
        this.name = other.name;
        this.rno = other.rno;
    }

    // Constructor with Parameters
    Student(int rno, String name, float marks) {
        this.marks = marks;
        this.name = name;
        this.rno = rno;
    }

    // Calling constructor from another constructor
    Student() {
        this(40, "Default Contr", 90.5f);
    }

}
