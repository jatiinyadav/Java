// // Practice Question, NOT ON LEETCODE

// public class Example {
//     public static void main(String[] args) {

//         for (int i = 2; i <= 40; i++) {

//             boolean ans = prime(i);
//             if (ans) {
//                 System.out.println(i + " " + ans);
//             }
//         }
//         // System.out.println(prime(2));
//     }

//     static boolean prime(int number) {

//         int squareRoot = (int) Math.pow(number, 0.5);

//         int start = 2;
//         int count = 0;

//         while (start <= squareRoot) {
//             if (number % start == 0) {
//                 count++;
//             }
//             if (count >= 1) {
//                 return false;
//             }
//             start++;
//         }

//         return true;
//     }
// }