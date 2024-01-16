
// Print Names 5 Times
class Names {
    public static void main(String[] args) {
        printName(0);
    }
    
    static void printName(int l){
        if(l == 5) return;
        System.out.println("Jatin Yadav");
        printName(++l);
    }
}

// Print Linearly 1 to N
public class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		printName(5, 1);
	}
	
	    static void printName(int l, int k ){
        System.out.println(k);
        if(k == 5) return;
        printName(l, ++k);
    }
}

// Print from N to 1
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		printName(5);
	}
	
	    static void printName(int l){
        System.out.println(l);
        if(l == 1) return;
        printName(--l);
    }
}
