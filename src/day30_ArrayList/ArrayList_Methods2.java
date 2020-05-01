package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");  //0
        list.add("B"); //1
        list.add("C");  //2


        // list.remove(1);


        boolean r1 = list.remove("F"); // false

        boolean r2 = list.remove("A"); // true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);


        list.clear(); // []

        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // 0
        list2.add(1);  // 1
        list2.add(2);  // 2
        list2.add(3);  // 2

        //{1,1,2,3}

        int num1 = list2.indexOf(1); //0
        // Integer = int  // AUtoboxing

        System.out.println(num1);

        int num2 = list2.indexOf(100);
        System.out.println(num2);

        int num3 = list2.indexOf(3);  //3
        System.out.println(num3);


        System.out.println("-====================================");

     ArrayList<String>  klas = new ArrayList<>();
     klas.add("P");
     klas.add("M");
     klas.add("Y");
     klas.add("Q");

     boolean u =klas.remove("m");
     boolean j =klas.remove("M");

        System.out.println(u);
        System.out.println(j);
        System.out.println(klas);


        ArrayList<Integer> sanlar = new ArrayList<>();

        sanlar.add(0);
        sanlar.add(90);
        sanlar.add(65);
        sanlar.add(34);


        sanlar.remove(3);
        System.out.println(sanlar);
        System.out.println();

        int a = sanlar.indexOf(90);
        System.out.println(a);
        System.out.println(sanlar);








    }
    }
