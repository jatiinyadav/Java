import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        String tiles = "AAABBC";
        ArrayList<String> resp = combination(tiles, "");
        System.out.println(resp);
        System.out.println(resp.size() - 1);
    }

    static ArrayList<String> combination(String title, String ans) {

        if (title.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        char c = title.charAt(0);
        ArrayList<String> left = combination(title.substring(1), ans + c);
        ArrayList<String> right = combination(title.substring(1), ans);

        left.addAll(right);
        return left;
    }

}