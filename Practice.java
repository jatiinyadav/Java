import java.util.Arrays;

class Test{
    static String name;

    Test(String name){
        Test.name = name;
    }
}

public class Practice {
    public static void main(String[] args) {

        Test ex = new Test("Hello");
        System.out.println(Test.name);

    }

}
