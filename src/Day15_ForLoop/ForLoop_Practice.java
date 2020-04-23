package Day15_ForLoop;

public class ForLoop_Practice {

    public static void main(String[] args) {
        /*
            odd number betweeen 1 ~100 in a single line sperated by a space
                                1 3 5 7 9 ....
         */
        String resultOdd = "";

        for (int number = 1; number <= 100; number += 2) {
            //   System.out.print(number+" ");
            // resultOdd += number+" ";
            resultOdd = resultOdd + number + " ";
        }

        System.out.println(resultOdd);

        /*
            Even number between 1 ~ 100
                        2 4 6 8 10 ....
         */

        String resultEven = "";
        for (int number = 0; number <= 100; number += 2) {
            resultEven += number + " ";
        }

        System.out.println(resultEven);

        System.out.println("====================================================");


        String reseven ="";

        for (int i=0; i<=50; i+=2){
            reseven=reseven+i+" ";
        }
        System.out.println(reseven);



        String resodd ="";

        for (int odd=1; odd<=50; odd+=2){
            resodd+=odd+" ";
        }
        System.out.println(resodd);
    }



    }
