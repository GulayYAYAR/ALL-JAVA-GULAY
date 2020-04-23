package Gaytalamak;

import java.util.Scanner;

public class Iffffffflerr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("hiiiii");

        boolean premiumcus = true;

        int booknum = 6;


        if (premiumcus == true) {
            System.out.println("hkm");

            if (booknum>=5 && booknum<7) {
                System.out.println("1 free book");
            } else if (booknum>=7 ) {
                System.out.println("2 free book");
            }
        } else {

            if (booknum>= 8 && booknum<12) {
            System.out.println("1 fee book");
        } else if (booknum >= 12) {
            System.out.println("2 free book");
        }
    }


        System.out.println("=====================================");

        int m=90;

        if (m>=0 && m<=10){
            System.out.println("0-10");
        }else if (m>=10 && m<=20){
            System.out.println("10-20");

        } else if (m>=20 && m<=30) {
            System.out.println("20-30");
        }else {
            System.out.println("30++");
        }


        System.out.println("===============================");

        int k =2;

        if (k%2==0){
            k+=1;
            System.out.println(k+" odd");
        }else if (k%2!=0){
            k+=1;
            System.out.println(k+" even");
        }
        System.out.println(k);


        System.out.println("===============================");

        int a =10;
        int b =20;
        int c =30;
        //String res ="";

        if (a>b && a>c){
            System.out.println(a+ " max num");
        } else if (b>a && b>c){
            System.out.println(b+" max num");


        }else {
            System.out.println(c+ " max num");


        }


        System.out.println("============================");

        double grade = 50;

        char ch =0;

        if (grade>=90){
            ch='A';
        }else if (grade>=80){
            ch='B';
        }else if (grade>=70){
            ch='C';
        }else if (grade>=60){
            ch='D';
        }else {
            ch='F';
        }

        System.out.println(ch);

        System.out.println("============================================");






    }

}
