package day21_MultidimensionalArrays;
import java.util.Arrays;
public class ForEachLoop {


 /*
		for(DataType variableName : ArrayName ){
		}
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for (int eachElement : nums) {
            System.out.println(eachElement);
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for (String eachStudent : students) {
            System.out.println(eachStudent);
        }


        int[] arr1 = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        for (int each : arr1) {

            if (each < 5) {
                continue;
            }

            System.out.println(each);
        }


        System.out.println("========================================================");
        String sentnce = "I like Java";   // Java like I

        String[] words = sentnce.split(" ");  // [I, like, Java]

        for (String eachWord : words) { // 0 ~ 2
            System.out.println(eachWord);
        }

        System.out.println("====================================");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int mal [] = {2, 4, 5, 6, 7, 8, 9, 0};

        for (int eachmal: mal){
            System.out.print(eachmal+" ");
        }
        System.out.println();
        String jorlar [] ={"jeren", "jemal", "zylly", "mylly"};

        for (String eachjora: jorlar){
            System.out.print(eachjora+" ");
        }
        System.out.println();
         int san [] = {30, 70, 80, 50, 40, 20, 10, 100};

        for(int eachsan: san ){
           if (eachsan>50){
                continue;
            }
            System.out.print(eachsan+" ");
        }
        System.out.println();
     String sozlem = "I like java";
     String soz []=sozlem.split(" ");





       // System.out.println(sozlem);

     for (String eachsoz: soz){
         System.out.print(eachsoz);
     }
        System.out.println();
    for (int i=soz.length-1; i>=0; i--){
        System.out.println(soz[i]);
    }



    }
}
