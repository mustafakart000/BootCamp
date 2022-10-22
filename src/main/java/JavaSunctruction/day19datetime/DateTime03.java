package JavaSunctruction.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        // zaman farkını saat olarak hesaplayınız.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime currentDateTimeInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.MINUTES.between(currentDateTimeInGermany,currentDateTimeInJapan);
        System.out.println("fark = " + fark);

        //Example   2: sabir bir tarih oluşturunuz.
        LocalDate myDate = LocalDate.of(2015, Month.APRIL, 13);

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries country = Countries.USA;

    }
}
