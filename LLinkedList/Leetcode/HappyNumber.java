package LLinkedList.Leetcode;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public boolean isHappy(int num) {
        int fast = num;
        int slow = num;

        do {
            slow = sum(num);
            fast = sum(sum(num));
        } while (fast != slow);

        if(slow == 1){
            return true;
        }

        return false;
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem * rem;
        }

        return sum;
    }

    public static void main(String[] args) {
    }

}
