package fundamentals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) {
        Date dateNow = new Date();

        LocalDate myLocalDate = LocalDate.now();
        System.out.println("MY LOCAL DATE");
        System.out.println(myLocalDate);

        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println("MY LOCAL DATE AND TIME");
        System.out.println(myLocalDateTime);

        Instant myInstant = Instant.now();
        System.out.println("MY INSTANT");
        System.out.println(myInstant);

        LocalDate textToDate = LocalDate.parse("2022-08-12");
        System.out.println("TEXT TO DATE");
        System.out.println(textToDate);
    }
}
