// // Solving using Seive of Eratosthenes
// // Practice Question NOT ON LEETCODE

// public class Practice {
//     public static void main(String[] args) {

//         int n = 20;
//         boolean[] primes = new boolean[n + 1];
//         prime(n, primes);
//     }

//     static void prime(int n, boolean[] primes) {

//         for (int i = 2; i * i < n; i++) {
//             if (!primes[i]) {
//                 for (int j = i * 2; j <= n; j += i) {
//                     primes[j] = true;
//                 }
//             }
//         }

//         for (int index = 2; index < primes.length; index++) {
//             if (!primes[index]) {
//                 System.out.print(index + " ");
//             }
//         }

//     }

// }