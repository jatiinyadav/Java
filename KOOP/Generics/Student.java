package KOOP.Generics;

// Comparable is an in built class used to Compare data
// Comparable Class is an interface that's why compareTo is the function we have to use.
public class Student implements Comparable<Student> {

    int roll;
    int marks;

    public Student(int roll, int marks){
        this.marks = marks;
        this.roll = roll;
    }

    @Override
    public String toString(){
        return this.marks + " ";
    }

    @Override
    public int compareTo(Student o) {

        int diff = this.marks - o.marks;

        return diff;
    }
    
}
