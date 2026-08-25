public class BitwiseOperator {
    public static void main(String[]args){
        //Bitwise Operators ---> & , | , ^ , ~ , << , >> , >>> , &= , |= , ^= , >>= , <<= , >>>= //
        int a = 34;
        int b = 12;
        int c = a & b;// returns 0 only if both bits are 0 otherwise retuens 1//
        int d = a | b;// returns 1 if at least one bits is 1 otherwise returns 0//
        int e = a^ b;// retuwns 1 if both bites are same otherwise returns 0//
        int f = ~a; // inverts all the bits (0<--->1) 
        int g = a<< 7; // shift bits left by 7 positions and fill 0 in the rightmost bits//
        int h = a>> 3; // shift bits right by 3 positions and fill 0 in the leftmost bits//
        int i = a>>> 3; // shift bits right by 3 positions and fill 0 in the leftmost bits for positive numbers and fill 1 in the leftmost bits for negative numbers//


        System.out.println("Bitwise AND of the two numbers :" +c);
        System.out.println("Bitwise OR of the two numbers :" +d );
        System.out.println("Bitwise XOR of the two numbers :" +e);
        System.out.println("Bitwise NOT of the two numbers :" +f);
        System.out.println("Bitwise Left Shift of the two numbers :" +g);
        System.out.println("Bitwise Right Shift of the two numbers :" +h);
        System.out.println("Bitwise Unsigned Right Shift of the two numbers :" +i);

        int j = 2;
        j &= 2;
        int k = 4;
        k |= 4;
        int l = 5;
        l ^= 5;
        int m = 6;
        m = ~m;
        int n = 7;
        n >>= 7;
        int o = 8;
        o <<= 8;
        int p = 9;
        p >>>= 9;
        int q= 9;

        System.out.println("Bitwise AND assignment of the two numbers :" +j);
        System.out.println("Bitwise OR assignment of the two numbers :" +k);
        System.out.println("Bitwise XOR assignment of the two numbers :" +l);
        System.out.println("Bitwise NOT assignment of the two numbers :" +m);
        System.out.println("Bitwise Right Shift assignment of the two numbers :" +n);
        System.out.println("Bitwise Left Shift assignment of the two numbers :" +o);
        System.out.println("Bitwise Unsigned Right Shift assignment of the two numbers :" +p);
     
    }  
}
