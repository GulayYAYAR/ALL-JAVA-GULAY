package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {


        // DataType Variable = Date
        byte num1 = 127;
        short num2 = num1;   // double > float > long > int > short > byte

      //  byte num3 = num2;

        int num4 = num2;  // int is preffered by compiler

        long num5 = 99999999999l;

        float num6 = 100L;

        System.out.println(num6); //100.0
        // 1. 100,  2. 100L,    3. 100.0

        float num7 = 0.05f;
        System.out.println(num7); //0.05
         double num8 = 0.5f;
         double num9 = 9999999999l;
         double num10 = 100.05;

        System.out.println(num10);

        char ch1 = '$'; // every single character has a corresponding number
        System.out.println(ch1);//$
        char ch2 = 4500;      // 0 ~ 65566
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1); //56
        int a2 = 'z';
        System.out.println(a2);  //122

        double d1 = '8' + 'z';  //  z8, 178, 178.0
        System.out.println(d1);

        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(9 > 10); //false

        System.out.println(9 >= 9); //true

        System.out.println(9 != 10 ); //true

        System.out.println('a'== 'b'); //false

        System.out.println('a' == 'b' - 1); //true
        //                  97 == 98 - 1
        //                  97 == 97    true

        System.out.println( " Muhtar" == "Good guy"); // false

        System.out.println(" Muhtar" != "Good guy"); // true

        System.out.println("Muhtar"== "muhtar"); // false

      //  System.out.println("Cybertek"== 100000);

        boolean r1 = !true; //false

        System.out.println(r1); // false
        System.out.println(!r1); //true

        System.out.println(!true == false); //true
        System.out.println(!true != !false); // true






































    }
}
