// Recursion

// class Solution {
//     public int numberOfSteps(int num) {

//         return numOfSteps(num, 0);
//     }
    
//     private int numOfSteps(int number, int steps){
//         if(number == 0){
//             return steps;
//         }

//         if(number % 2 == 0){
//             return numOfSteps(number / 2, steps + 1);
//         }

//         return numOfSteps(--number, steps + 1);
//     }
// }