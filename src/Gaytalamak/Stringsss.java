package Gaytalamak;

import java.util.ArrayList;

public class Stringsss {

    public static void main(String[] args) {

///                 012345678910
        String s = "I like programming with Java";


    /// s.substring(11);
        System.out.println(s.charAt(0) + " " + s.charAt(s.length()-1));

        String firstChar = s.substring(0,1);
        String lastChar = s.substring(s.length()-1);


        //

        for (int i=0; i<s.length(); i++){

          //  String sub = s.substring(i,i+1);

            if(s.charAt(i)=='a') {
                System.out.println("hi");
            }
        }


        //  s = "abcdefg"   ->>  // a c e g

//                    012345678910
        String str = "abcdefghccc"; // length=7

        int length = str.length();

        System.out.println(str.substring(length-4));

        for (int i=0; i<length/2; i++){

                System.out.println(str.charAt(i));

        }

        /// string a = "123456" --> 123,    a="12345" ->> 12


        int n = str.indexOf('c');
        int m = str.lastIndexOf('c');

        str  = str.replace('c','z');

        System.out.println(str);

        System.out.println(str.charAt(3));

        System.out.println(n);
        System.out.println(m);

        System.out.println("==================================================");

        String s1 = "Lale";
        String s2 = "Allamova";

        s1 = s1 + " ";
        s1 = s1 + s2;

        System.out.println(s1);

        System.out.println("==================================================");

        String s3 = "";

        boolean boshmy = s3.isEmpty();

        //isEmpty
        System.out.println(boshmy);

        System.out.println("==================================================");
        //           0123456
        String s4 = "abc.com";
        String s5 = "abc@hotmail.com";

        System.out.println(s4.startsWith(".c"));

        System.out.println("==================================================");






    }
}
