public class Practice {
    public static void main(String[] args) {

        String name = null;
        System.out.println(check(name));
    }

    static String check(String name) {

        if(name == null){
            return "Not a Palindrone";
        }

        int start = 0;
        int end = name.length() - 1;

        while (start <= end) {

            if (name.charAt(start) == name.charAt(end)) {
                start++;
                end--;
            } else {
                return "Not a Palindrone";
            }
        }

        return "A Palindrone";

    }
}