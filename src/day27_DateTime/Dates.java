package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25);

        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2020, 12, 25);

        System.out.println(birthday);

        // isAfter(date2)
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        // isBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        // isLeapyear();
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("=========================================================");

        LocalDate now = LocalDate.now(); // 2020-04-23
        System.out.println("Today is: " + now);

        String str = now.toString();
        System.out.println(str.replace("-", " "));



        // month/day/year




        System.out.println("++++++=========++++++=====+++++++++===++++++++++====+++++==++====+===+=");


        LocalDate godovdhina = LocalDate.of(2019, 8,25);
        System.out.println("Our godovshina is on: "+godovdhina);

        LocalDate mybirthday= LocalDate.of(1994,5,23);
        System.out.println("Happy birthday to me: "+mybirthday);

        boolean netije =godovdhina.isAfter(mybirthday);
        System.out.println(netije);

        boolean netije2 =mybirthday.isBefore(godovdhina);
        System.out.println(netije2);

        boolean netije3 = godovdhina.isEqual(mybirthday);
        System.out.println(netije3);



        LocalDate now2 = LocalDate.now();
        System.out.println("to day is: "+now2);


        String str2 = now2.toString();
        System.out.println(str2.replace("-", "/"));








    }
    }
