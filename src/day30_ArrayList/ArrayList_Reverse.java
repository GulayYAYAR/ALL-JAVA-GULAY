package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {
      /*
    2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }

        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            // int eachNum = list.get(i);  // unboxing
            reversedList.add(list.get(i));
        }

        System.out.println(reversedList);


        System.out.println("======================================");

        ArrayList<Integer> san = new ArrayList<>();

        for (int i=1; i<=10; i++){
            san.add(i);
        }
        System.out.println(san);

         ArrayList<Integer> revsan = new ArrayList<>();

         for (int i = san.size()-1; i>=0; i--){
            revsan.add(san.get(i));

         }

        System.out.println(revsan);




    }
    }
