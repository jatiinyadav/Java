package JRecursion.Questions.Patterns;

public class ATriangle {
    public static void main(String[] args) {
        pattern2(4, 0);
    }

    static void pattern2(int row, int column) {

        if(row == 0){
            return;
        }

        if(row > column){
            System.out.print("* ");
            pattern2(row, column + 1);
        } else {
            System.out.println();
            pattern2(row - 1, 0);
        }

    }

    // Without Recursion
    static void patternWithoutRecursion() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i - 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // With Recursion
    static void pattern1(int row, int column) {
        if (row == 0){
            return;
        }

        if(row > column){
            pattern1(row, column + 1);
            System.out.print("* ");
        } else{
            pattern1(row - 1, 0);
            System.out.println();
        }

    }
}
