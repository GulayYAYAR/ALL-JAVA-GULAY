package day16_ForLoop;

public class ContinuePractice {

    public static void main(String[] args) {
        // skip print Y, H, J, D

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            if (ch == 'Y' || ch == 'H' || ch == 'J' || ch == 'D') {
                continue;
            }

            System.out.print(ch + " ");

        }

        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");

        }

        System.out.println("=============================================");

        for (char ch ='a'; ch<='z'; ch++){
            if (ch=='a' || ch=='b' || ch=='c'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();
        for (int i=1; i<=10; i++){
            if(i==2 ||i==3 || i==4){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
