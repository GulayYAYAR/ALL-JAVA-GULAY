package day23_Methods;

 import java.util.Scanner;

public class HomeWorks {

    public static void main(String[] args) {

        int maxnum=0;
        printMaxNum(maxnum);


    }

    public static void printMaxNum(int maxNum){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 =scan.nextInt();
        int num2 =scan.nextInt();



        int  res=(num1<num2)? num1: num2;

        System.out.println(res);

        }








}
