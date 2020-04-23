package day21_MultidimensionalArrays;
/*
    2. write a program that can return the logest string of text from an array
    3. write a program that can return the shortest string of text from an array
 */

public class Longest_ShortestWords {

    public static void main(String[] args) {
        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String logestword = names[0];
        String shortestWord = names[0] ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                logestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(logestword);
        System.out.println(shortestWord);

        System.out.println("=++++++=====++++++++++++++++++++++===++==============+==========++");


        String [] atlar = {"Mahym", "gozel", "sirin", "merjenjemal"};

        int maximlength=atlar[0].length();
        int minimlength=atlar[0].length();

        String uzynat =atlar[0];
        String gysgaat =atlar[0];

        for ( int i=0; i < atlar.length; i++){
            if(atlar[i].length()>maximlength){
                maximlength= atlar[i].length();
                uzynat=atlar[i];

            if (atlar[i].length()< minimlength){
                minimlength=atlar[i].length();
                gysgaat=atlar[i];
            }
                System.out.println(uzynat+" is the longest name ");
                System.out.println(gysgaat+" is the shortest name");

            }
        }












    }


}
