package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        //   int scores = 90 , 10, 20;  regular variables can only have one data

        /*
        decleration:
				DataType[]  variableName = { dat1, data2, data3 };
				// 70, 75, 85, 90, 95, 100
         */

        int[] scores = {70, 75, 85, 90, 95, 100};
        //               0   1    2   3   4   5

        // retrive: variableName[index]

        int num1 = scores[2]; //85,  int

        System.out.println(num1);


        int num2 = scores[5]; // 100, int

        System.out.println(num2);

        System.out.println("=====================================================");


        int [] age = {25, 35, 45, 55, 65};

        int num =age[0];

        System.out.println(num);


        System.out.println("=============================================");

        String [] family ={"ilmyrat", "gulnabat", "lale", "batyr", "sulgun", "selbi"};

        System.out.println(family[0]);



    }
    }
