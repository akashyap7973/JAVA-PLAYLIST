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
    }  
}
