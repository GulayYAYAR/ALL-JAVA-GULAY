package Exersize;
import java.util.Scanner;
public class mysal3 {
    public static void main(String[] args) {

/*
        input: cyBerTek sChooL
        output:
        Cybertek
                School
*/


        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");

        String fullname = input.nextLine();  //cybertek school
        String firstname = fullname.substring(0, fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" "),+1);




        System.out.println(fullname);


    }
}