package IStrings;

public class DPalindrone{
    public static void main(String[] args) {
        // String name = "A man, a plan, a canal: Panama";
        String name = "race a car";

        boolean ans = palindrone(name);
        System.out.println(ans);
    }

    // BruteForce Approach
    static boolean palindrone(String name) {
        
        String ans = name.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder character = new StringBuilder();

        for(int i = ans.length() - 1; i >= 0; i--){
            character.append(ans.charAt(i));
        }


        for(int j = 0; j <= ans.length() - 1; j++){
            if(ans.charAt(j) != character.charAt(j)){
                return false;
            }
        }

        return true;
    }
}

// Optimised Approach
// class Solution {
//     public boolean isPalindrome(String s) {
//         if(s == null || s.length() == 0) return true;
//         s = s.toLowerCase();
//         for(int i = 0, j = s.length()-1;i<j;i++,j--){
//             while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
//                 i++;
//             while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
//                 j--;
//             if(s.charAt(i) != s.charAt(j)) return false;
//         }
//         return true;
//     }

// }