package day16_ForLoop;

public class Alphabets {

    public static void main(String[] args) {

        String upperCase = ""; //A~Z
        String lowerCase = ""; // a~z

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            upperCase += ch;
        }


        System.out.println(upperCase);

        for (char ch = 'a'; ch <= 'z'; ch++) {
            lowerCase += ch;
        }

        System.out.println(lowerCase);

        // Aa Bb Cc Dd ....
        String result = "";

        for (int i = 0; i <= upperCase.length() - 1; i++) {

            result += upperCase.charAt(i) + "" + lowerCase.charAt(i) + " ";

        }

        System.out.println(result);

        System.out.println('a' + "" + 'b');


        //second solution
        int a = 97;
        int A = 65;

        String result2 = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) (A + i);  // upper case characters
            //          65
            char ch2 = (char) (a + i);
            //                97+0

            result2 += ch + "" + ch2 + " ";
        }

        System.out.println(result2);

        System.out.println("================================================");

    String upcase = "";
    String lowcase = "";

    for (char ch='Z'; ch>='A'; ch--){
        upcase+=ch+" ";
    }
        System.out.println(upcase);


    for (char ch='z'; ch>='a'; ch--){
            lowcase+=ch+" ";
        }
        System.out.println(lowcase);


    //Aa, Bb, Cc,


        String res ="";

        for (int i=0; i<=lowcase.length()-1; i++){
            res+=""+ upcase.charAt(i)+lowcase.charAt(i);
        }
        System.out.println(res);







    }
}
