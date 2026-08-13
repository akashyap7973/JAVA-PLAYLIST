public class operator {
    public static void main(String[]args){
    // Arithmetic Operators ---> + , - , * , / , % , += , -= , *= , /= , ++ , --//
    int a = 23;
    int b = 98;

    System.out.println("Addition of the two numbers :" + ((a + b)));
    System.out.println("subtraction of the two numbers :" +((a -b)));
    System.out.println("Multiplication of the two numbers :" +((a*b)));
    System.out.println("division of the two numbers :" +((a/b)));
    System.out.println("modulus of the two numbers :" +((a%b)));
    
    int c = a + 5; 
    // c = a - 3 ; // since this is ok in CSE than we make shortcit c+=3
    c += 4; // increment in the value of c which is already define 
    c -= 4;//30
    c /= 10 ;//10
    c %= 10;//2
    c *= 10;//2
    System.out.println("value of c :" +c); 

    int i = 20;
    int j = 30;

    i++ ; // prefix increment //i = i + 1 ---> i += 1;
    --j ; // postfix decrement // j = j -1 ---> j -= 1;

    System.out.println(i);
    System.out.println(j); //9

    int k = j++; // k = j; j = j +1;
    System.out.println(j+ ", " + k); // 10, 9 

    int l = ++i; // l = i + 1; i = i+1 ; 
    System.out.println(i + ", " + l); //22 , 22





  }
}