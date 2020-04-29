package day28_DateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();

        System.out.println(time1);

        LocalTime time2 = LocalTime.of(23, 50, 30);

        System.out.println(time2);

        System.out.println("==========================");


        LocalTime suwagt =LocalTime.now();
        System.out.println(suwagt);


        LocalTime agsam= LocalTime.of(22, 56,34);
        System.out.println(agsam);

    }
}