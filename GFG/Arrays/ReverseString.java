package GFG.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Geeks";
        String ans = "";

        for(int i = str.length() - 1; i >=0 ; i--){
            ans += str.charAt(i);
        }

        System.out.println(ans);

    }
}
