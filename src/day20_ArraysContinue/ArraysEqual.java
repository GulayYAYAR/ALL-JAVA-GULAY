package day20_ArraysContinue;
import java.util.Arrays;
public class ArraysEqual {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean result1 = Arrays.equals(arr1, arr2);

        System.out.println(result1);

        int[] arr3 = {3, 2, 1};
        int[] arr4 = {1, 2, 3};
        boolean result2 = Arrays.equals(arr3, arr4);
        System.out.println(result2);


        int[] arr5 = {3, 2, 1};
        int[] arr6 = {2, 1, 3};
        Arrays.sort(arr5);  //[ 1,  2,  3]
        Arrays.sort(arr6); // [ 1, 2, 3]

        boolean result3 = Arrays.equals(arr5, arr6);  // true

        System.out.println(result3);

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};

        boolean result4 = Arrays.equals(array1, array2);  // false
        System.out.println(result4);


        System.out.println("====================================================");



        int [] m = {70, 80, 90};
        int [] l = {70, 80, 90};

        boolean res = Arrays.equals(m, l);

        System.out.println(res);


        String [] m1 = {"Maral, Jeren, Sona"};
        String [] l1 = {"Maral, Jeren, Sona"};

       // boolean jem = Arrays.equals(m1,l1);

        System.out.println(Arrays.equals(m1, l1));




        int o [] = {'c', 'b', 'a'};
        int p [] = {'a', 'c', 'b'};

        Arrays.sort(o);
        Arrays.sort(p);

       // System.out.println(p);

        //System.out.println(o);

        System.out.println(Arrays.equals(o, p));











    }
}