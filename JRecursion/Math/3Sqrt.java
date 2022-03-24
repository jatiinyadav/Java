// // Not a leetcode question
// // Square root of a number using Netwon Raphson Method

// public class Practice {
//     public static void main(String[] args) {

//         int number = 98;
//         double ans = sqrt(number);
//         System.out.printf("%.3f", ans);

//     }

//     static double sqrt(int num) {

//         int start = 0;
//         int end = num;
//         double ans = 0.00;

//         while(start <= end){
//             int mid = start + (end - start) / 2;

//             if(mid * mid == num){
//                 return mid;
//             }
//             if(mid * mid < num){
//                 start = mid + 1;
//             } else{
//                 end = mid - 1;
//             }
//         }

//         for (int i = 0; i <= 1; i++){
//             while(ans * ans <= num){
//                 ans += 0.19;
//             }
//             ans -= 0.19;
//         }

//         return ans;

//     }

// }