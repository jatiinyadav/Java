package Questions;

public class PermutationWithSpace {

    static void withSpace(String in, String ans) {

        if (in.length() == 1) {
            System.out.println(ans + in.charAt(in.length() - 1));
            return;
        }

        char c = in.charAt(0);
        withSpace(in.substring(1), ans + c + "_");
        withSpace(in.substring(1), ans + c);

    }

    static void caseChange(String in, String ans) {

        if (in.length() == 0) {
            System.out.println(ans);
            return;
        }

        char c = in.charAt(0);
        caseChange(in.substring(1), ans + c);
        caseChange(in.substring(1), ans + (char) (c - 32));

    }

    public static void main(String[] args) {

        // withSpace("ABC", "");
        // caseChange("ab", "");

    }
}
