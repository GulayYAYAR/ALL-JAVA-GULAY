package Exersize;
import java.util.Scanner;
public class LoopExercize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      /*  warmup tasks:
        1. write a program that can ask the user "enter a number" five times and return the maximum number
        hint: you will nedd for loop and if statement
        2. write a program that can ask the user "enter a number" five times and return the minimum number
        3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length
   */

        System.out.println("Enter 5 numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int minnum = 0;

        for (int i = 0; i <= 5; i++) {

            if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {
                minnum = num1;
            } else if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {
                minnum = num2;
            } else if (num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5) {
                minnum = num3;
            } else if (num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5) {
                minnum = num4;
            } else
                minnum = num5;
        }
        System.out.println("The min num is: "+minnum);

     /*   System.out.println("=========================================================");

        System.out.println("Enter 5 words: ");
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();
        String word4 = input.next();
        String word5 = input.next();
        String maxlength = "";


      //  for (int i=1; i<=5; i++ ){
          //  if (){

            }
        }












/*
Warmup tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
	3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
	4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
 */


















    }
}


