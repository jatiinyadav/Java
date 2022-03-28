public class Practice {
    public static void main(String[] args) {

        pattern();

    }

    static void pattern(){

        for (int i = 4; i > 0; i--){
            for(int j = 0; j <= i - 1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}