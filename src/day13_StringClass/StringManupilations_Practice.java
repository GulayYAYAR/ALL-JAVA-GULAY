package day13_StringClass;

/*
    input: cyBerTek sChooL
    output:
        Cybertek
        School
 */

import java.util.Scanner;



public class StringManupilations_Practice {

    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1); // School
        //cYbeRTEK

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is " + firstName);
        System.out.println("Your last name is " + lastName);

*/

        /*
        Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */



     Scanner input = new Scanner(System.in);

        System.out.println(" Enter your full name");

          String fullname = input.nextLine();  // Gylych Mammedov

        String firstname = fullname.substring(0, fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ")+1 );

        firstname = firstname.substring(0, 1).toUpperCase();
        lastname = lastname.substring(0,1).toUpperCase();

        System.out.println("Your initial is: " +firstname+lastname);



    }




    }
