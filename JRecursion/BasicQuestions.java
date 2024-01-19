
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

// Sum of 1st N Numbers 
// Parameterised
public class Main
{
    static int ans = 0;
	public static void main(String[] args) {
		int n = 5;
		cal_sum(ans, n);
	}
	
	static void cal_sum(int ans, int num){
	    if(num == 0) {
	        System.out.println(ans);
	        return;
	    }
	    cal_sum(ans+=num, --num);
	}
}

// Functional
public class Main
{
    static int ans = 0;
	public static void main(String[] args) {
	    System.out.println(cal_sum(5));
	}
	
	static int cal_sum(int num){
	    if(num == 0) return ans;
	    return ans = num + cal_sum(--num);
	}
}

// Reverse Array using Recursion
import java.util.Arrays; 

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5};
	    swap(arr, 0, arr.length - 1);
	    System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int left, int right){
	    if(left > right){
	       return;
	    }
	    int temp = arr[left];
	    arr[left] = arr[right];
	    arr[right] = temp;
	    swap(arr, ++left, --right);
	}
}

// Check Palindrone
public class Main
{
	public static void main(String[] args) {
		String name = "madam";
		System.out.println(palindrone(name, 0));
	}
	
	static boolean palindrone(String name, int i){
	    
	    if(i > name.length() - i - 1){
	        return true;
	    }
	    
	    if(name.charAt(i) != name.charAt(name.length() - i - 1)){
	       return false;
	    }
	    
	    return palindrone(name, ++i);
	    
	}
}
