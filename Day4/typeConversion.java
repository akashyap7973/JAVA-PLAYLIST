package Day4;
public class typeConversion {
    public static void main(String[]args){
        //implicit conversion (where destination data type should be wider (higer)then source DESTINATION > SOURCE)

        // byte to int //
        byte b = 12;
        int i  ;
        i = b ;
        System.out.println("Value of i :" +i);

        //Explicit conversion (narrowing conversion) with the use of casting (where destination < source )

        //int to byte //
         int h = 300;
         byte B ;
        //  B = h ; not converted becuse int > byte 
        B = (byte)h ; // casting 

        char c = 'a';
        int x ;

        x = (int)c;

        System.out.println("Value of B :" +B);
        //Outputt is 44 data is trancating use casting byte size is 8 bit that we use only 8 bits //
        System.out.println("Value of x :" +x);

        //Trancating conversion //

        //float to int //

        float F = 167.88f;
        int U ;
         
        // U = F ; Not allowded because int print only intger not decimal and char value //

        U = (int)F;

        System.out.println("Vlaue of U (int) :" +U);

        

    }
}