package day28_DateTime;
import java.time.LocalDate;

public class LocalDate_Practice {
      /*
    Warmup task:
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays
     */

    public static void main(String[] args) {
        String[] friends = {"John", "Aaron", "Daniel"};
                     //        0       1        2

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday  = LocalDate.of(2010, 5, 6);

        LocalDate[] birthdays = {JohnBirthday, AaronBirthday, DanielBirthday};
        //   0               1            2

        for(int i = 0; i < friends.length; i++){
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println( name+"'s birthday is "+ bd );
        }


        /*
        int a = 100;
        int b = 200;
        int c = 300;
        int[] array1 = {a, b, c};
         */


        System.out.println("===================================================");


        String [] family ={"Ilmyrat", "Gulnabat", "Lale", "Batyr", "Sulgun", "Selbi"};

        LocalDate dad = LocalDate.of(1970,3,13);
        LocalDate mom = LocalDate.of(1973,1,1);
        LocalDate mine =LocalDate.of(1994,5,23);
        LocalDate brom =LocalDate.of(1996,2,6);
        LocalDate sis1 = LocalDate.of(1998,8,23);
        LocalDate sis2 = LocalDate.of(2000,6,4);

        LocalDate [] birthdaysss ={dad, mom, mine, brom, sis1, sis2 };

        for(int i=0; i<family.length; i++ ){
            String atlar =family[i];
            LocalDate doglangunler = birthdaysss[i];

            System.out.println(atlar+"'s birth day is "+doglangunler);


        }


    }


}
