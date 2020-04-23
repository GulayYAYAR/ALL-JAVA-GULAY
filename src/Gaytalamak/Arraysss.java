package Gaytalamak;

//import java.util.Scanner;

public class Arraysss {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,8};

        // a.length => 5
        // int q0 = a[0]    -> q0=1
        // int q1 = a[1]    -> q1=2

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.print("the last one: ");
        System.out.println(a[a.length-1]);

        System.out.println(a[3]);
        System.out.println(a[1]);

        String s = "new york city";

        String[] arr = {"men","sen","olar"};
        //arr.length = 3;;
        // arr[0] = "men";
        // arr[arr.lenth-1] = "ol"

        // arr array'indeki elemanlarin her harfinin sonuna + eklior
        for(int i=0;i<arr.length;i++){
            String temp = arr[i];
            for(int j=0;j<temp.length();j++){

                System.out.print(temp.charAt(j));
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println(arr[2].charAt(2));

        System.out.println("=========================");

        int[] intArray = new int[5];
/*
        Scanner input = new Scanner(System.in);

        for(int i=0;i<intArray.length;i++){
            intArray[i] = input.nextInt();
            System.out.println(intArray[i]);
        }
        // i=0, intArray[0] = 1;
        //i=1, intArray[1]=1;

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
*/
        System.out.println("=======================");

        int [] sanlar ={10,12,14,15,23};
        int sum=0;
        for (int i=0; i<sanlar.length;i++){
            sum+=sanlar[i];

        }

        System.out.println(sum);
        int [] sanlar2 ={10,12,14,15,23};
        for (int i=0;i<sanlar2.length; i++){
            if(sanlar2[i]%2!=0){
                System.out.println(sanlar2[i]);
            }
        }
        System.out.println("============");
        String string = "AABCBBADD";
        // A->3 , B->3, C->1, D->2
        String nonDup = "";

        for(int i=0;i<string.length();i++){
            String currentChar = string.substring(i,i+1);
            if(!nonDup.contains(currentChar)){
               nonDup += currentChar;
            }
        }
        /*
        i = 0 ,     c=A,    nonDup = "A"
        i=1 ,       c=A,
        i=2,        c=B,     nonDup = "AB"
        i=3,        c=C,      nonDup = "ABC"
        i=4,        c=B
        i=5,    c=B
        i=6,    c=A
        i=7,    c=D     nonDup = "ABCD"
        i=8,    c=D
         */

        System.out.println(nonDup);

        //ABCD

        for(int i=0;i<nonDup.length();i++){
            // c her gezeginde nonDup'yñ index i daki char ny alyar
            char c = nonDup.charAt(i);
            // count hem edil hazir hazirki harpyng nace gezek bardygyny sanayar...
            int count = 0;
            // nonDup'yn index i daki karakteri ucin gozlap bashlayar
            for(int j=0;j<string.length();j++){
                if(string.charAt(j)==c) {
                    count++;
                }
            }
            System.out.println(c + " -> " +count);
        }

        /*

        nonDup = "ABCD"
        c = B
        stirng = "AABCBBADD"
        count = 0

         */


    }
}
