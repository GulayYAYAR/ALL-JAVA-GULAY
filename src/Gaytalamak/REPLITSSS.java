package Gaytalamak;

public class REPLITSSS {

    public static void main(String[] args) {

        int a = 16782345;
        int r0 = a%10;     // r0 = 5
        a /= 10;        // a= 1678234

        int r1 = a%10;  //r=4
        a/=10;      // a= 167823
        int r2 = a%10;  // r2 =3

        a/=10;      //a=16782
        int r3 = a%10;  //r3=2;

        a/=10;  //a=1678
        int r4 = a;  //r4= 1678

        System.out.println(r4); // 1678
        System.out.println(r3);  // 2
        System.out.println(r2);     //3
        System.out.println(r1);     //4
        System.out.println(r0);     //5


        //////////////----//////////











    }





}
