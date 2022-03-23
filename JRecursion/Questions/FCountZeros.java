package JRecursion.Questions;

public class FCountZeros {
    public static void main(String[] args) {
        
        int number = 30001;
        int count = 0;
        // Method 1
        System.out.println(countZeros(number, count));
    }

    // Method 1
    // static int counting = 0;
    // static int countZeros(int number) {
        
    //     int rem = number % 10;
    //     if(number == 0){
    //         return counting;
    //     }

    //     if(rem == 0){
    //         counting++;
    //     }

    //    return countZeros( number /10 );
    // }

    static int countZeros(int number, int count){
        
        if(number == 0){
            return count;
        }
        int rem = number % 10;
        if(rem == 0){
            return countZeros(number / 10, ++count);
        }

        return countZeros(number / 10, count);

    }
}
