package day02_Variables;

public class Variable {
    public static void main(String[] args) {
        /* declare variables
                DataType Variable =Data;
         */

    byte l = 4;
    byte w = 2;
    byte area = 8;

        System.out.println(l);
        System.out.println(w);
        System.out.println(area);



        //byte num1 = 130;    exceed the range of byte

        short num3 = 1000;
        //short num4 = 40000; exceed the range of byte
        System.out.println(num3); //1000

        System.out.println(12345); // by default compiler takes it as int primitive
        int n1 = 20000;
        int n2= 1000000000;
        System.out.println(n2);

       // long n3 = 99999999999        //out of the int,   compiler by default takes it as int
        long n4 = 99999999999l; // forcefully telling the compiler that this is long data number,
        System.out.println(n4);

        System.out.println(99999999999L);
        long n5 = 19;
        // int number = 7L; cannot be assigned to smaller one
        //double > float> long> int> short> byte
        short s1 = 10;
        // byte b1 = s1; //short is larger than byte

        int i11 = s1;

        //byte b2 = il; larger one cannot be assigned to smaller one

        System.out.println( 3.5 );
        double d1 = 3.5;

        //flout f1 = 4.5;  //double primitive is larger than float primitive , cannot assigned
        float f2 = 5.5f;
        System.out.println(f2);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        float pi = 3.14f;
        double p = 3.14f;

        int a1 = 3000;
        double d2 = a1;    //3000.0
        System.out.println(d2);





















    }

}
