// public class Practice {
//     public static void main(String[] args) {
//         pattern17(4);
//     }

//     static void pattern1(int length) {
//         for (int i = 1; i <= length; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.print("\n");
//         }
//     }

//     static void pattern2(int length) {
//         for (int i = 0; i < length; i++) {
//             for (int j = 0; j < length; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }

//     static void pattern3(int length) {
//         for (int i = 1; i <= length; i++) {
//             for (int j = 0; j < length - i + 1; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }

//     static void pattern4(int length) {
//         for (int i = 1; i <= length; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//         }
//     }

//     static void pattern5(int length) {
//         for (int i = 1; i <= 2 * length - 1; i++) {
//             int totalColsInRow = i > length ? 2 * length - i : i;
//             for (int j = 1; j <= totalColsInRow; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }

//     static void pattern28(int length) {
//         for (int i = 1; i < 2 * length; i++) {
//             int totalColsInRow = i > length ? 2 * length - i : i;

//             // int spaces = i > length ? i - length : length - i;
//             int spaces = length - totalColsInRow;

//             for (int s = 0; s < spaces; s++) {
//                 System.out.print(" ");
//             }

//             for (int j = 0; j < totalColsInRow; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern30(int length) {
//         for (int i = 1; i <= length; i++) {

//             for (int s = 0; s < length - i; s++) {
//                 System.out.print(" ");
//             }

//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void pattern17(int length) {

//         for (int i = 1; i <= 2 * length; i++) {

//             int totalCols = i > length ? 2 * length - i : i;

//             int spaces = length - totalCols;

//             for (int s = 0; s < spaces; s++) {
//                 System.out.print(" ");
//             }

//             for (int j = totalCols; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             for (int j = 2; j <= totalCols; j++) {
//                 System.out.print(j + " ");
//             }

//             System.out.println();

//         }

//     }
// }