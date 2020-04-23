package Gaytalamak;

import java.util.Scanner;

public class Loopssss {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);

        for (int i=0; i<50;i++){
            if (i % 5 == 0 && i% 3 == 0) {

                System.out.println(i);

            }
        }
        System.out.println("=================================");

        int a =0;
        while( a<50 )
        {

            if (a % 5 == 0 && a % 3 == 0) {

                System.out.println(a);




            }

            a++;
        }

        System.out.println("==========================");

/*
        System.out.println("Enter 3 numbers: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        // n=1; m=20;  k=3;    1, 4, 7, 10, 13, 16, 19;

        for (int i=n; i<=m; i+=k){
            System.out.println(i);
        }

       */




        System.out.println("=============================");

        for (int i=2; i<=10; i++){
            for( int b=1; b<=10; b++){
                System.out.print(i*b+" ");
            }
            System.out.println();
        }
        System.out.println("========================================");
       int n=4;
        int con =0;
        for (int i=1; i<=10; i++){
            if (i%2!=0 ){
                con++;
            }if (con==4){
                System.out.println(i);
                break;
            }
        }
        System.out.println("========================================");

        int oddNumber = 1;
        int m=5;

        for(int i=1;i<m;i++){
            oddNumber += 2;
        }

        System.out.println(oddNumber);

        System.out.println("========================================");

        int k=4;
        System.out.println(2*k-1);

        System.out.println("========================================");

        int y=2;
        int y2=3;
        int result =1;

        // 2 uzeri 3 = 1*2*2*2
        for (int i=1; i<=y2; i++){
           result*=y;
        }
        System.out.println(result);

        System.out.println("=========================================");

        int c=3;
        int p=7;

        for (int i=3; i<=p; i++){
            System.out.println(i);
        }

       /*
       1
       12
       123
       1234

          1
         12

       n=4
        */
       for (int i=1; i<=4; i++){
          // for (int mm=4; mm>=i; mm--){
               //System.out.print(" ");
          // }
           for (int x=1; x<=i; x++){
               System.out.print(x);
           }
           System.out.println();
       }






    }


}
