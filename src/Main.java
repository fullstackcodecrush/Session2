import java.util.Scanner;

class Main {
     public static void main(String[] args) {

//         System.out.println("Welcome to CS TECH !!");

//         variables and datatypes
//        primitive data types (8) int ,short, byte,long  ---> numbers or integers
//          double , float --> decimal numbers
//                 char --> characters e.g, 'a', 'i,' 0,
//                 boolean --> true or false
//         non-primitive data types - String

                 // Declaring a variable

//         long number1= 1234567891;
        int  number;
        //Assign value
         number = 10;
//         System.out.println(number);
//         System.out.println("Number is :"+number);
//         char gender='m';
//         System.out.println("Gender : "+gender);
         float no=12.5f;

         double no1 = 25.7;

         boolean isMajor=true;
//         System.out.println("Is Shekar major : "+isMajor);
//         System.out.println(no1);
//         System.out.println(no);

//         Scanner class
         Scanner scan=new Scanner(System.in);

         System.out.println("Enter first number ");
         int firstNumber=scan.nextInt();

         System.out.println("Enter second number ");
         int secondNumber = scan.nextInt();

         // +,-, * ,/  division  --> quotient ,%  modulo -- remainder

         int addition =firstNumber+secondNumber;
//         System.out.println("Sum of +firstNumber" +" and "+secondNumber+" is "+addition);
         System.out.println("Sum of "+firstNumber +" and "+secondNumber+" is "+addition);


     }
 }