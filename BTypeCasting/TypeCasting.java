package BTypeCasting;

public class TypeCasting {
    public static void main(String[] args){
        int rollNumber = (int)(23.64f);
        System.out.println(rollNumber);
        
        System.out.println("-------");
        
        int number = 'A';
        System.out.println(number);

        //  Rules
        // 1. All byte, short, char are promoted to int
        // 2. If any operand is long whole operation will be promoted to long


        int i = 10;
        double d = 12.950343;
        float f = 34.643f;
        char c = 'A';
        long l = 8975l;

        double result = ((i / c ) + (l / d) + (f));

        System.out.println((i / c ) +  " " + (l / d) + " " + (f));

        System.out.println(result);

    }
}
