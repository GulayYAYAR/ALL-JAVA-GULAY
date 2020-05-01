package Officehours.Practice_04_29_2020;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        //indeOf(Object) ==> returns the index num
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A'); // 0
        list1.add('B');//1
        list1.add('C'); //2
        list1.add('D');//3
        list1.add('C'); //4


        int indexnum = list1.indexOf('C'); //2
        int lastIndexNum = list1.lastIndexOf('C'); //4
        System.out.println(indexnum);
        System.out.println(lastIndexNum);

        System.out.println(list1);
        Character ch1 = 'C';
        //  list1.remove(ch1); remove the first 'C'

        list1.remove(list1.lastIndexOf('C'));


        System.out.println(list1);


        // comninint two arrays into list

        System.out.println("==========================================");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13};

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int each : arr1) { // each element of arr1
            list2.add(each);
        }

        for (int each : arr2) { // each element of arr2
            list2.add(each);
        }

        System.out.println(list2);


        System.out.println("=================================");

        int [] a = {1,2,3,4,5,};
        int [] b = {6,7,8,9,10};

        ArrayList<Integer> gosmak = new ArrayList<>();

        for (Integer each :a){
            gosmak.add(each);
        }
        System.out.println(gosmak);
        for (Integer each :b){
            gosmak.add(each);

        }
        System.out.println(gosmak);

    }
}
