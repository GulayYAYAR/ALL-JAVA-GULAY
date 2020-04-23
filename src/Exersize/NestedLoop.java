package Exersize;

public class NestedLoop {
    public static void main(String[] args) {

        System.out.println("hello");
        int z = 1;
        while (z ==1) {

            int i = 1;
            while (i <2) {
                System.out.println("* ");
                 i++;
            }
             int b =1;
             while (b<2) {
                 System.out.println("* * ");
                  b++;
             }
              int c=1;
              while (c<2) {
                  System.out.println("* ");
                      c++;
              }
                 int d=1;
              while (d<2) {
                  System.out.println("* * ");
                  d++;

              }
              int e=1;
              while(e<2) {
                  System.out.println("* * * ");
                  e++;

              }
                z++;
            }

            System.out.println();





        }

}