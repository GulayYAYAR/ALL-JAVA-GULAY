package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3};

        String r = Arrays.toString(arr);
        System.out.println(r);

        System.out.println(arr); // ARray bMUST be converted to string before we print


        String names[] = {"Madina", "Fatih", "Osman"};

        System.out.println(Arrays.toString(names));


        double[] nums = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + 1);

        System.out.println("================================================");

         int t[] ={9, 8, 6, 4};

         Arrays.sort(t);

         String n = Arrays.toString(t);

        System.out.println(n);

        String [] kizlar = {"Sulgun", "Selbi", "Jemal", "Keyik"};

        Arrays.sort(kizlar);

        System.out.println(Arrays.toString(kizlar));


        double tom [] = {13.0, 56.8, 78, 90, 55.4};
        Arrays.sort(tom);

        System.out.println(Arrays.toString(tom));

        System.out.println(tom[4]/2);











    }
}


