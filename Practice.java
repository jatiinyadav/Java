import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        System.out.println(modify(3, 3, ""))    ;

    }

    static ArrayList<String> modify(int row, int column, String ans) {

        if (row == 1 && column == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();

        if (row > 1) {
            res.addAll(modify(row - 1, column, ans + 'D')); 
        }

        if (column > 1) {
            res.addAll(modify(row, column - 1, ans + 'R'));
        }

        return res;
    }

}
