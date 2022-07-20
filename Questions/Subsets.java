package Questions;

public class Subsets {

    static void subsets(String name, String ans) {
        if (name == "") {
            System.out.print(ans + " ");
            return;
        }

        char c = name.charAt(0);
        subsets(name.substring(1), ans + c);
        subsets(name.substring(1), ans);
    }

    public static void main(String[] args) {

        subsets("aab", "");

    }
}
