package EMethods;
import java.util.Arrays;

// Var args is something when we don't know how many inputs we are giving

public class VariableLengthArguments {
    public static void main(String[] args) {

        varargs(2,54,8,9,3,78,5,5,83,8,3,9);
        mixArgs(20, 40, "My", "Name", "is", "Jatin", "Yadav");
    }

    // Same Type
    static void varargs(int ...params){

        System.out.println(Arrays.toString(params));

    }

    static void mixArgs(int n1, int n2, String ...strings){
        System.out.println(n1 + " " + n2 + " " +  Arrays.toString(strings));
    }
}
