
package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);


        // 2020-03-20 11:25:30
        LocalDate date = LocalDate.of(2020, 3, 20);
        LocalTime time = LocalTime.of(11, 25, 30);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.of(2020, 3, 20, 11, 25, 30);

        System.out.println(dateTime2);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  // 3/20/2020
        LocalDate date2 = LocalDate.of(2019, 3, 20);

        System.out.println(date2.format(dtf));

        System.out.println("+===========++++++++====+++++++========+++++=====++++++=========");

        LocalDate duyn = LocalDate.of(2020, 04,26);
        LocalTime duynsagat5 = LocalTime.of(5,45,40);

        LocalDateTime duynsagatduyn =LocalDateTime.of(duyn,duynsagat5);

        System.out.println(duynsagatduyn);

        LocalDateTime duynsagatduyn2 = LocalDateTime.of(2020,04,26,5,45,40);

        System.out.println(duynsagatduyn2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE yyyy, MM, dd");
        LocalDate gun = LocalDate.of(2019,8,23);
        System.out.println("Gyz tarap toyumyz!!! "+ gun.format(dtf3));







    }
    }
