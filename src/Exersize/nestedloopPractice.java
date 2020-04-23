package Exersize;
import java.util.Scanner;
public class nestedloopPractice {

     /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */
   /*
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);


         while(true) {


             int KingBed = 120;
             int QueenBed = 100;
             int singlebed = 80;



             System.out.println("Which bedroom do you wanna reserve: ");
             String answer = input.next();
             boolean valid = (answer.equalsIgnoreCase("King Bed ")|| answer.equalsIgnoreCase("Queen Bed ")|| answer.equalsIgnoreCase("Single Bed");

                 System.out.println("King bed price is: "+KingBed);
                 System.out.println("Queen bed price is: "+QueenBed);
                 System.out.println("Single bed price is: "+singlebed);

               if (answer.equalsIgnoreCase("King Bed")){
                   answer+=KingBed;
               } if (answer.equalsIgnoreCase("Queen Bed ")){
                   answer+=QueenBed;
               } if (answer.equalsIgnoreCase("Single Bed ")){
                   answer+=singlebed;
                 }
             while (!valid) {
                 System.out.println("Please re enter: King Bed or Queen Bed or Single Bed ");
                 answer = input.next();

                 System.out.println("Do you wanna reserve another room: ");
                 String answer2 = input.next();

                 if (answer2.equalsIgnoreCase("Yes ")) {
                     System.out.println("King bed price is: " + KingBed);
                     System.out.println("Queen bed price is: " + QueenBed);
                     System.out.println("Single bed price is: " + singlebed);
                     // answer2+=KingBed+QueenBed+singlebed;
                 }
                 if (answer2.equalsIgnoreCase("No")) {
                     System.out.println("Your total price: ");
                     break;
                 }

             }
         }


     }
    */
}

















