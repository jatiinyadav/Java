public class Practice {
    public static void main(String[] args) {

        System.out.println(isPalindrome("naman"));

    }

    static boolean isPalindrome(String s) {
                
        String name = "";

        for(int i = 0; i < s.length() ; i++){
            char one = s.charAt(i);
            name = name + one;
        }

        System.out.println(s);
        System.out.println(name);

        return name == s;
    }

}