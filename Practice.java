import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        int number = 981;
        prime(number);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void prime(int number){

        list.add(1);
        
        for(int i = 2; i < number / 2; i++ ){
            if(number % i == 0){
                list.add(i);
            }
        }
        list.add(number);

        System.out.println(list);         

    }

}