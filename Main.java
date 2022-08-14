public class Main {

    public static void main(String[] args) {

        String str = "abXYZba ";

        int start = 0;
        int end = str.length() - 1;

        String ans = "";

        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                ans += str.charAt(start);
            } else {
                break;
            }
            start++;
            end--;
        }

        System.out.println(ans);
    }
}