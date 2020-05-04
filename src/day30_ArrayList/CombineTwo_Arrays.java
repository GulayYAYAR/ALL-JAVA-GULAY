package day30_ArrayList;
import java.util.ArrayList;

public class CombineTwo_Arrays {
     /*
    4. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G", "H", "I"};

        ArrayList<String> list = new ArrayList<>();  //  {"A", "B", "C", "D", "E", "F", "G"}

        for (int i = 0; i < arr1.length; i++) {
            String eachElement = arr1[i];
            list.add(eachElement);  //arr1[i];
        }

        for (String eachElement : arr2) {
            list.add(eachElement);
        }


        System.out.println(list);

        System.out.println("================================");


        String [] a = {"1","2","3"};
        String [] b = {"4", "5","6"};

        ArrayList<String> gosmak = new ArrayList<>();

        for (String each :a){
            gosmak.add(each);

        }
        System.out.println(gosmak);

        for (String each :b){
            gosmak.add(each);
        }
        System.out.println(gosmak);

    }
    }
