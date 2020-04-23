package Exersize;

import java.util.Scanner;

public class WhileLoopmysal {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


    /*
    write a program that asks to user enter her username and password until user enter correctly

     */

        System.out.println("Enter the username: ");
        String username =input.next();

        System.out.println("Enter the password: ");
        String password =input.nextLine();
        boolean valid = username.equalsIgnoreCase("username") && password.equalsIgnoreCase("password");


        while (!valid){
            System.out.println("please re enter:");



        if (valid){
            System.out.println("logged in");
        }if (!(username.equalsIgnoreCase("username"))) {
            System.out.println("incorrect username");
        }if (!(password.equalsIgnoreCase("password")) ){
            System.out.println("incorrect password");

        }

        }



    }
}
