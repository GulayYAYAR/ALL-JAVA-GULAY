package day23_Methods;

public class methodsWith_Parameters2{
    // 3. create a function that can reverse any string

    // "Muhtar" ==> rathuM,    "Cybertek" ==> ketrebyC

    public static void main(String[] args) {

        String name1 = "Muhtar";
        ReverseString(name1);

        String name2 = "Cybertek School";
        ReverseString(name2);
        System.out.println("-----------------------------");

        String atll="Lale";
        reverseAtlary(atll);
    }


    public static void ReverseString(String str){

        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();

    }

      public static void reverseAtlary(String at){

        for (int i=at.length()-1; i>=0; i--){

            System.out.print(at.charAt(i));
        }

      }

















}
