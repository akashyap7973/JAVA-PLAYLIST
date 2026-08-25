import javax.print.DocFlavor.STRING;

public class test1 {
    public static void main(String[]args){
//     //Write a Java program that stores:

// name = "Raman"
// age = 21
// percentage = 85.5
// grade = 'A'
// isPassed = true//
String Student = "Raman" ;
int age = 21;
float percentage = 85.5f;
char grade = 'A';
boolean ispassed = true ;

System.out.println("Name =" +Student);
System.out.println("age =" +age);
System.out.println("Percentage =" +percentage);
System.out.println("Grade =" +grade);
System.out.println("isPassed =" +ispassed);

//Q2. Arithmetic Calculator

// Given:

// int a = 25;
// int b = 10;

// Write a program to print:

// Addition: 35
// Subtraction: 15
// Multiplication: 250
// Division: 2
// Remainder: 5

// Use arithmetic operators.
int A = 25;
int B = 10;

int c = (A+B);//Addition
int d = (A-B);//Subtraction
int e = (A*B);//Multiplication
int f = (A/B);//Division 
int g = (A%B);//Modulus 

System.out.println("Addition =" +c);
System.out.println("Subtraction =" +d);
System.out.println("Multiplication =" +e);
System.out.println("Division =" +f);
System.out.println("modulus =" +g);

// Q3. Rectangle Calculation

// Given:

// int length = 20;
// int width = 10;

// Write a program to calculate and print:

// Area: 200
// Perimeter: 60

// Use the appropriate arithmetic operators.

int l = 20;
int W = 10 ;

int Area = (l*W);
int Perimeter = 2 * (l + W);

System.out.println("Area =" +Area);
System.out.println("Perimeter =" +Perimeter);

// Q4. Temperature Conversion

// Given:

// float celsius = 37.5f;

// Write a Java program to convert Celsius into Fahrenheit using:

// F = (C × 9/5) + 32

// Print the result using printf() with 2 decimal places.
float celsius = 37.5f;
float fahrenheit = (celsius * 9 / 5) + 32;
System.out.printf("Fahrenheit = %.2f%n", fahrenheit);

// MEDIUM — 4 Questions
// Q5. Average Marks

// A student has:

// int maths = 85;
// int physics = 78;
// int chemistry = 92;

// Write a program to calculate the average marks.

// Your output should look like:

// Total: 255
// Average: 85.00

// Use printf() for the average.

// Don't use if or loops.
int maths = 85;
int physics = 78;
int chemistry = 92;

int x = maths + physics + chemistry ; 
double y = x/3.0 ;

System.out.println("Total: " + x);
System.out.printf("Average: %.2f%n", y);

// Q6. Type Conversion Challenge

// Given:

// int a = 100;
// double b = 25.5;

// Write a program that:

// Converts a into double
// Converts b into int
// Prints both converted values.

// Expected concept:

// Original int: 100
// Converted double: 100.0

// Original double: 25.5
// Converted int: 25

// You must explicitly use type casting for the narrowing conversion.//
int h = 100;
double i = 25.5;

//convert int into double




 


 


    } 

    }
