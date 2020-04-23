package Day15_ForLoop;
public class ReverseString {


    public static void main(String[] args) {
        String str = "Universal";  //avaJ
        //            012345678

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        int lastIndexnum = str.length() - 1;

        String reverse2 = "";
        for (int i = lastIndexnum; i >= 0; i--) {
            //  System.out.print(str.charAt(i));
            reverse2 += str.charAt(i);
        }

        System.out.println(reverse2);


        /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */


        System.out.println("=====================================================");

        String k  = "tamat";

        String rev = " "+ k.charAt(4) + k.charAt(3)+ k.charAt(2)+k.charAt(1)+k.charAt(0);

        String rev2 = k.substring(4)+ k.substring(3,4)+k.substring(2,3)+k.substring(1,2)+k.substring(0,1);

         boolean pal =k.equalsIgnoreCase(rev);
         boolean pal2=k.equalsIgnoreCase(rev2);

        System.out.println(rev);
        System.out.println(rev2);

        System.out.println(pal);

        System.out.println(pal2);



    }

    }
