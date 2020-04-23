package day17_WhileLoops;

public class Frequency {

    public static void main(String[] args) {

        String str = "Cybertek School is a great place to study".toLowerCase();  //  is fun is cool

        int count = 0;

        String word = "s".toLowerCase();  // ignoring the case sensitiveity by converting both string to lowercase

        while (str.contains(word)) {

            count++;
            str = str.replaceFirst(word, ""); // after counting the first "Java",w e need to rmeove it from the str

        }


        System.out.println(count);

        System.out.println("========================================");


        String str2  ="lale Allamova";
        String word2 ="l".toLowerCase();

        int con =0;
        while(str2.contains(word2)){

            con++;
            str2= str2.replaceFirst(word2, " ");
        }
        System.out.println(con);
        System.out.println(str2);
        System.out.println(word2);
    }
}
