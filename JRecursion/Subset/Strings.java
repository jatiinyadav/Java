package JRecursion.Subset;

public class Strings {
    public static void main(String[] args) {

        modify("JatinaYadav", "");
    }

    static void modify(String example, String ans) {

        if (example.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = example.charAt(0);

        if (ch == 'a') {
            modify(example.substring(1), ans);
        } else {
            modify(example.substring(1), ans + ch);

        }

    }
}
