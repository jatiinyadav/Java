package JRecursion.MustDoProblems;

public class CReverseString {
    public static void main(String[] args) {

        String name = "jatinYadav";
        String rev = reverse(name, name.length() - 1, "");
        System.out.println(rev);

    }

    public static String reverse(String name, int len, String ans) {

        if (len < 0) {
            return ans;
        }

        return reverse(name, len - 1, ans + name.charAt(len));
    }
}
