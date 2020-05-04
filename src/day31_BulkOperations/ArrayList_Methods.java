package day31_BulkOperations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");


        boolean r1 = list1.contains("C");
        System.out.println(r1);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1); // list1: {A, B, C, D};
        Collections.sort(list2); // list2: {A. B, C, D};


        boolean r2 = list1.equals(list2);
        System.out.println(r2); // false

        System.out.println("===============================");
//Arrays.equal(arr1, arr2)

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        Arrays.sort(arr1);  //{1,2,3}
        Arrays.sort(arr2); //{1,2,3}

        boolean r3 = Arrays.equals(arr1, arr2);
        System.out.println(r3);

        System.out.println("=============================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        //  expected: 1000 100 20 10

        Collections.sort(list3);

        System.out.println(list3);

        ArrayList<Integer> reversedList3 = new ArrayList<>();

        for (int i = list3.size() - 1; i >= 0; i--) {
            //  System.out.print( list3.get(i) +" " );
            reversedList3.add(list3.get(i));
        }

        System.out.println(reversedList3);

        //  list3 = reversedList3;

        System.out.println(list3);

        System.out.println(list3.size()); //  size: 4

        list3.clear();  // removes everything, size : 0
        boolean r4 = list3.isEmpty();
        System.out.println(r4);


        System.out.println("=============================================");

        ArrayList<String> harp =new ArrayList<>();
        harp.add("l");
        harp.add("m");
        harp.add("k");

        boolean po = harp.contains("j");
        System.out.println(po);


       ArrayList<String> harp2 = new ArrayList<>();
       harp2.add("k");
       harp2.add("m");
       harp2.add("l");

       Collections.sort(harp);
       Collections.sort(harp2);
        System.out.println(harp);
        System.out.println(harp2);

       boolean kk = harp.equals(harp2);
        System.out.println(kk);


        ArrayList<Integer>  sanlar  = new ArrayList<>();
        sanlar.add(1);
        sanlar.add(2);
        sanlar.add(3);
        sanlar.add(4);
        sanlar.add(5);

        System.out.println(sanlar);


        ArrayList<Integer> reversanlar = new ArrayList<>();

        for (int i =sanlar.size()-1; i>=0; i--){
            reversanlar.add(sanlar.get(i));

        }
        System.out.println(sanlar);
        System.out.println(reversanlar);



    }
}
