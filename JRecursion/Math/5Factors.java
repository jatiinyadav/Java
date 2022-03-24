// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class Practice {
//     public static void main(String[] args) {

//         int number = 1024;
//         factors(number);

//     }

//     static void factors(int num) {

//         System.out.print(1 + " ");

//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i = 2; i * i < num; i++){
//             if(num % i == 0){
//                 System.out.print(i + " ");
//                 list.add(num /i);
//             }
//         }

//         for (int i = list.size() - 1; i > 0; i--){
//             System.out.print(list.get(i) + " ");
//         }

//         System.out.print(num + " ");


//     }

// }