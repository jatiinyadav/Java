import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        System.out.println(matchingStrings(strings, queries));

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();

        List<Integer> res2 = new ArrayList<Integer>();
        for (int i = 0; i < queries.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i) == strings.get(j)) {
                    count++;
                }
            }
            res.add(count);
        }

        res2.addAll(res);
        return res2;
    }

}