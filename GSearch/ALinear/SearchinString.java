package GSearch.ALinear;
public class SearchinString {
    public static void main(String[] args) {
        String name = "Jatin";

        char target = 'l';

        System.out.println(inString(name, target));
    }

    static boolean inString(String name, char target) {

        // METHOD 1
        // for (int i = 0; i < name.length(); i++) {
        //     if (name.charAt(i) == target) {
        //         return true;
        //     }
        // }

        // METHOD 2
        for(char character : name.toCharArray()){
            if (character == target) {
                return true;
            }
        }

        return false;
    }
}