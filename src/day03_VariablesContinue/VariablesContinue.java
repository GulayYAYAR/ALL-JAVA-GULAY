package day03_VariablesContinue;

public class VariablesContinue {
    public static void main(String[] args) {
        /*
        >: greater
		>=: greater or equal
		<: less
		<=: less or equal
		== : equal
		!= : not equal
         */

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9; //true
        System.out.println( result3);

        System.out.println( true == false );
        System.out.println("Lale" == "Good girl");  //totally false
                      //   Good girl == bad girl ==> false
        System.out.println("Lale" != "Good girl");  // true
        boolean r1 = true != true ; // false
        System.out.println(r1); //false

        boolean r2 = "Batch 17 " == "Batch 18"; //false
        System.out.println(r2); //false

        System.out.println("===================================================================");

        char ch1 = 'A';
        System.out.println(ch1);
         char ch2 = 45000;
        System.out.println(ch2);
         char ch3 = 25000;
        System.out.println(ch3);
                 char ch4 = 100;
        System.out.println(ch4);

        char ch5 = 'D'; //68
        System.out.println(ch5);

        int num1 = 'D'; //number
        System.out.println(num1);















    }
}
