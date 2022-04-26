package JRecursion.Subsequence;

public class Strings {
    public static void main(String[] args) {

        modify("appJatappleinaYadav", "");
    }

    static void modify(String example, String ans) {

        if (example.isEmpty()) {
            System.out.println(ans);
            return;
        }

        if (example.startsWith("apple")) {
            modify(example.substring(5), ans);
        } else {
            modify(example.substring(1), ans += example.charAt(0));

        }

    }
}
