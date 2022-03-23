package JRecursion.Questions;

public class CConcept{
    public static void main(String[] args) {
        
        func(5);
    }

    static void func(int number){

        if(number == 0){
            return;
        }

        System.out.print(number + " ");
        func(--number);

    }
}