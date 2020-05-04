package day31_BulkOperations;
import java.util.Arrays;
import java.util.ArrayList;

public class Remove_Duplicats {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3)) ;

        ArrayList<Integer> result = new ArrayList<>();  // 1 2 3
        //expected result: [1, 2, 3]


        for(Integer each : list){  // each: 1, 1, 2, 2, 3, 3

            if( !result.contains(each)){
                result.add(each);
            }

        }


        System.out.println(result);

        System.out.println("=========================================================");
        /*
        write a program that can remove duplicates from an array of integer
                    do not use for each
         */

        Integer[] arr1 = {1,1,2,2,3,3};
        ArrayList<Integer> nonDuplicates = new ArrayList<>();  // 123

        for(int i =0; i < arr1.length; i++){

            if( !nonDuplicates.contains( arr1[i] )){
                nonDuplicates.add(arr1[i]);
            }

        }

        /*
            +,
            []
            +=
         */
        System.out.println(nonDuplicates);


        System.out.println("-==========-============--================");


        ArrayList<String> harp = new ArrayList<>();

        String [] sal = {"l", "l", "p", "o", "p", "o"};

        harp.addAll(Arrays.asList(sal));

        System.out.println(harp);

        ArrayList <String> removeduppp = new ArrayList<>();


        for (String each : harp){
            if (!(removeduppp.contains(each))){
                removeduppp.add(each);

            }
        }

        System.out.println(harp);
        System.out.println(removeduppp);





        ArrayList<Integer> sanlar = new ArrayList<>();
        Integer [] san = {1,1,2,3,2,3,4,5,6,6,5,4};
        System.out.println(Arrays.toString(san));
        System.out.println(sanlar);

        ArrayList<Integer> removesanlar = new ArrayList<>();


        for ( int i=0; i<san.length; i++){
            if(!removesanlar.contains(san[i])){
              removesanlar.add(san[i]);
            }
        }


       System.out.println(Arrays.toString(san));
        System.out.println(removesanlar);
    }
}
