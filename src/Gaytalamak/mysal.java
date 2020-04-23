package Gaytalamak;

public class mysal {
    public static void main(String[] args) {

        int[][] numbers = {
                               {1, 2, 3},
                               {4, 5, 6, 7, 8, 9},
                               {10, 11, 12, 13, 14},
                               {15, 16, 17, 18, 19, 20, 21}
                                              };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

         int count =0;
        for (int i = 0; i < numbers.length;i++ ){

            for (int j=0; j<numbers[i].length; j++) {
                      int num=numbers[i][j];

                if (num% 2 == 0) {
                    System.out.print(num+" ");

                   // System.out.println();
                } else {
                    count++;
                    //System.out.print(count);
                }

            }

        }
        System.out.println();
        System.out.print(count);

    }
}