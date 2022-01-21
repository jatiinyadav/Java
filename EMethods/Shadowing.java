package EMethods;
public class Shadowing {
    static int x = 10; // This value will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);

        int x = 50;
        System.out.println(x); // This is lower level and it will override the higher level
        shadow();
    }

    static void shadow(){
        System.out.println(x);
    }
}

// Scope will begin when the value is being initialized