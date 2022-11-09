package operators;

public class BitwiseOperators {

    public static void main(String args[]) {
        System.out.println("working on bitwise operators");
        //bitwise and or not, right shift, left shift
        //5 = 101
        //6 = 110
        //5&6 = 100 = 4
        //5|6 = 111 = 7
        //5>>1 = 0101 = 0010 basically divide by 2
        //5<<1 = 0101 = 1010 basically multiply by 2
        int result = 5&6;
        int bitwiseOr = 5|6;
        System.out.println(result);
        System.out.println(bitwiseOr);
        System.out.println(5>>1);
        System.out.println(5<<1);

    }
}
