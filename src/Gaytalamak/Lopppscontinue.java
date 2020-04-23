package Gaytalamak;

public class Lopppscontinue {

    public static void main(String[] args) {

      long num = 1;

        for (int i =1; i<=20; i++){

           num*=i;
        }


        System.out.println(num);

        System.out.println("=====================================");

        /*

        a! = 1*2*3*...*a
        4! = 1*2*3*4 = 24

        total = 1;

        for(int i=1;i<=a;i++){
            total *= i;
        }
        factorial hesaplama
         */

        int b = 30;
        int tot = 1;
        for (int e=1; e<=b; e*=2 ){
           tot*= e;
           System.out.println("e: " + e);
        }
        System.out.println(tot);


        // a

        /*

            a=2,  b=4,     a exp (4) , 1*a*a*a*a

            for(int i=1;i<=b;i++){
                total *= a;
            }

            total = 1;
         */

        int a = 2;
        int c =4;
        int total=1;
        for (int i=1; i<=c; i++){
            total*=a;

        }
        System.out.println(total);



      for (int i=10; i>=0; i--){
          System.out.println(i);
      }


      int u =20;
      boolean isPrime = true;
      // prime number : diñe 1e we ozune bolunyan sanlara aydylyar...

      // 11 : 2,3,4,5,6,7,8,9,10

        for(int i=2;i<u;i++){
            if(u%i==0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }


        System.out.println("===================");

        /*
        n=4

      1:  1
      2:  12
      3:  123
      4:  1234

      row:3
      column: 3

        1
        12
        123
         */

        for (int row=1; row<=4; row++){
            for(int column=1; column<=row;column++){
                System.out.print(column);
            }
            System.out.println("");
        }

        System.out.println("================");

        /*


        n=4

        ****
        ****
        ****
        ****

         */
        int san =1;
        for (int i =1; i<=4; i++){
            for (int z=1; z<=4; z++){
                System.out.print(i);
            }
            System.out.println();
                san++;
        }

        System.out.println("===========================");
        for(int i =1;i<=4; i++){            // i=2

            for(int j=4;j>=i;j--){           // j=1
                System.out.print(" ");     // boshluk = 2
            }

            for(int l=1; l<=i; l++){        //

                System.out.print(""+ l);
            }
            System.out.println();

         }


        /*

        n=4
           1
          12
         123
        1234


         */


        /*

        n=4

        4321
        4321
        4321
        4321

         */

        for (int i =4; i>=1; i--){
            for (int m =4; m>=1; m--){
                System.out.print(m);
            }

            System.out.println();
        }




    }



}
