package day23_Methods;
import java.util.Scanner;
public class methodsWith_Parameters {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();

        EligibleToBuyAlcohol(age); // explicit casting
        System.out.println("================");

        eligible_age_toVote (age);

    }


    public static void EligibleToBuyAlcohol(byte age){

        if(age >= 21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }
        System.out.println("+++++====================================");
    }

      public static void eligible_age_toVote (int age){

        if (age >=18){
            System.out.println("Can vote ");
        } else {
            System.out.println("can Not vote ");
        }
          System.out.println(age);

      }

















}
