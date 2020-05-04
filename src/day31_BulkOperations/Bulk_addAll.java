package day31_BulkOperations;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30, 20, 40, 50, 45, 35, 200

        /*
                    list1.add(30);
                    list1.add(20);
                    list1.add(40);
                    list1.add(50);
                    list1.add(45);
                    list1.add(35);
                    list1.add(200);
         */


        //   list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200)  );

        //  int[] arr1 = { 30, 20, 40, 50, 45, 35, 200 };  // arraylist does not supoort primitive

        Integer[] arr1 = {30, 20, 40, 50, 45, 35, 200};

        list1.addAll(Arrays.asList(arr1));

        System.out.println(list1);


        System.out.println("====================================================================");
        String[] names = {"Murtaza", "Muhtar", "Muhesong", "Sada", "Rustem"};
        // 0            1         2           3        4

        // names[5] = "Osman";

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        // collectionType
        nameList.add("Osman");
        nameList.remove("osman");
        System.out.println(nameList);

        System.out.println("================================================");
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numbers));


        System.out.println(numList);


        System.out.println("-==================================");

      ArrayList<Integer> sanlar = new ArrayList<>();

      Integer [] op = {1, 2, 3, 4, 5, 6, 7};

      sanlar.addAll(Arrays.asList(op));

        System.out.println(sanlar);




        ArrayList<String> atlar = new ArrayList<>();

        String [] gyzlar = {"Bilbil", "Guncha", "Sirin", "Keyik"};

        atlar.addAll(Arrays.asList(gyzlar));

        System.out.println(atlar);

        atlar.add("Osman");

        System.out.println(atlar);

        atlar.remove(atlar.size()-2);
        System.out.println(atlar);






    }
    }
