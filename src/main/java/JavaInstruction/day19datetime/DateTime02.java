package JavaSunctruction.day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1: Java dan aldığınız date'i "ay/gun/yıl" olarak yazınız.
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // MM yerine MMM yazarsan Ayı Oct 3 harfli kısaltma verir eğer MMMM koyarsanız Ayın
        //Tam ismini yani October Yazar.
        String formattedDate=dtf.format(currentDate);
        System.out.println("formattedDate = " + formattedDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);// Oct/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);//October/21/2022

        // tek "M" ise Tek haneli Ayları 03 değil de 3 olarak yazar.
        // Gün içinde Aynı şey geçerli. tek "d" ayın 2. günü 02 yerine 2 yazar.
        // yıl içinde "yy" koyarsak iki haneli yazar.

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);//1.2.3.4/21/2022

        //Example 2: Java dan Aldiğiniz Time'in formatini değiştriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println("myTime = " + myTime);//myTime =
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//HH 24 saat sistemini, "hh" 12 saat sistemini kullanir.
        String formattedMyTime1 = dtf7.format(myTime);//
        System.out.println("myTime = " + myTime);
        System.out.println(formattedMyTime1);//04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 PM

    }
}
