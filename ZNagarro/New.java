package ZNagarro;

public class New {
    public static void main(String[] args) {
        
        int i = 1;

        int last = 0;

        int num = 30;
        while(num > 0){
            if((num & 1) == 1){
                last = i;
            }
            i++;
            num >>= 1;
        }

        int number = 0;
        int extra = 30;

        int index = 1;
        for(int l = 0; l <= last; i++){
            if((extra & 1) == 1){
                number = (number & (0 << index));
            } else{
                number = (number & (1 << index));
            }
            index++;
            extra >>= 1;
        }

        System.out.println(number);

    }
}
