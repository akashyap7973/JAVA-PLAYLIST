package Day4;
public class typePromotion {
    public static void main(String[]args){
        Byte b = 12;
        char c = 'a';
        short s = 1214;
        float f = 870.f;
        int i = 500000;
        double d = .1234;

        double result = ((f*b)) + ((i/c)) -((d* s)); 
        // float * byte = float
        //int /char = int 
        //doublr * short = double
        System.out.println("result is :" +result);
        System.out.println((f*b) + " + " + (i/c) + " - " + (d * s));  }
}
