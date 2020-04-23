package day04_JavaRecap;

public class Arithmatic_Operators {
    public static void main(String[] args) {

        int a = 10/3; //3
        // 10/3 ==>3.333
        System.out.println(a);

        //10/4= 2.5
        System.out.println( 10 / 4 ); //2

        double d = 10/4;
        //double d = 2;
        // d==> 2.0
        System.out.println(d);  //2.0


        System.out.println( 10/4);// 2

        System.out.println(10.0 / 4 );// 2.5
        System.out.println(10 / 4.0 );//2.5
        System.out.println(10.0 / 4.0 );//2.5

        // 10/4 = 2.5;
        float f1 = 10/4; //if your add f as a float  like  f1 = 10/4f ; it will take as float decimal number 2.5
        // float f1= 2;
        System.out.println(f1); // 2.0


        boolean evenNumber = 25 % 2 == 0;  //even number
        //                      1 = 0  => is false
        // if 25/2 has remainder of 0, then it is even number

        System.out.println(evenNumber); //false
        System.out.println(25 % 2);

        boolean oddNumber = 22 % 2 != 0;  // odd number
        //                  0 / 0 != 0 ==> false
        System.out.println(oddNumber);

        System.out.println(10%2==0); // 10 is even number
        System.out.println(11%2 != 0); //11 is odd number


        System.out.println("10 is even number: " + (10%2==0));  //true
        System.out.println("11 is even number: " + (11%2 == 0)); //false

        System.out.println("25 is odd number: " + ( 25% 2 != 0)); //true
        System.out.println("25 is even number: " + !(25%2 != 0)); //false
        System.out.println("25 is even number: " + (25%2 == 0)); //false




















    }
}
