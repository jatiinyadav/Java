public class Practice {
    public static void main(String[] args) {

        modify("12", "");

    }

    static void modify(String name, String ans) {

        if (name.isEmpty()) {
            System.out.print(ans + " ");
            return;
        } 

        int digit = name.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            modify(name.substring(1), ans + ch);
        }

    }

}
