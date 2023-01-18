package javainstruction.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataTimesHomeWork01 {
    public static void main(String[] args) {

        // Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        //Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        LocalDate dobAliDate =  LocalDate.of(2002,05,12);
        System.out.println("dobAliDate = " + dobAliDate);//dobAliDate =2002-05-12
        LocalDate dobAliToday = LocalDate.now();
        long dobAliTotal= ChronoUnit.DAYS.between(dobAliDate,dobAliToday);
        System.out.println("dobAliDate = " + dobAliTotal);//dobAliDate =7468

//        memet'nin kaç ay yaşadığını bulan kodu yazınız.
//        memet'nin doğum tarihi 4 Haziran 1997'dir

        LocalDate dobMemet=  LocalDate.of(1997,06,4);
        LocalDate dobMemetToday= LocalDate.now();
        long dobMemetTOtalMonth= ChronoUnit.MONTHS.between(dobMemet,dobMemetToday);
        System.out.println("dobMemetTOtalMonth = " + dobMemetTOtalMonth);//dobMemetTOtalMonth =304

        // Veli'nin doğum tarihi 4 Haziran 1997'dir. Veli'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        //sonraki tam tarihi bulmak için kodu yazınız.

        LocalDate dobVeli = LocalDate.of(1997,06,4);
        LocalDate dobVeliTotally= dobVeli.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("dobVeliTotally = " + dobVeliTotally);//dobVeliTotally =1999-09-16

        // Ahmet, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //Taner, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //Ahmet ve Taner'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //Ahmet ve Taner'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.

        LocalDate afterDobAhmet = LocalDate.of(1923, 10,29); // bu ifade String döndürür ve equals
        //...kullanabiliriz
        LocalDate dobAhmet = afterDobAhmet.plusYears(45).plusMonths(8).plusDays(5);// bu
        //...method Long dur bu ifadeyi String çevirerek Equals kullanabiliriz.
        LocalDate afterDobVeli =  LocalDate.of(1993,9,15);
        LocalDate dobVeli2 = afterDobVeli.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("DobAhmet = " + dobAhmet+ "  dobVeli2 = "+dobVeli2);
        String dobAhmetStr = String.valueOf(dobAhmet);
        String dobVelitStr = String.valueOf(dobVeli2);
        if (dobAhmetStr.equals(dobVelitStr)){
            System.out.println("Ahmet İle veli Aynı Tarih'de doğmuştur.");
        } else {
            System.out.println("Ahmet ve Veli Aynı Tarih'de doğmamıştır");
            Long ahmetVeliDiff = ChronoUnit.DAYS.between(dobAhmet, dobVeli2);
            System.out.println("ahmetVeliDiff = " + ahmetVeliDiff);//ahmetVeliDiff = 0

        }
        // Kemal, Aslı'den 3 yıl 11 gün sonra doğmuştur.
        //Aslı size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        //Kemal'nin doğum tarihini hesaplamak için gerekli kodu yazınız.

        LocalDate dobKemal = LocalDate.of(2012,11,24).
                plusYears(3).plusMonths(0).plusDays(11);
        System.out.println("Kemal'in doğum günü: "+dobKemal);

        // Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
        //olarak hesaplayınız.
        LocalDate dobMyself = LocalDate.of(1989,3,15);
        LocalDate dobismail = LocalDate.of(1994,7,20);
        long diffIandHim= ChronoUnit.DAYS.between(dobMyself, dobismail);
        System.out.println("Yaş gün farkı: "+diffIandHim);

        // Belirli bir tarihte yılın son 2 hanesini alınız.
        LocalDate bugunTarih = LocalDate.now();
        int sonİkiRakam = bugunTarih.getYear()%100;
        System.out.println("yılın son iki hanesi = " + sonİkiRakam);

        // Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        //Artık Yıl:

        Scanner scanner = new Scanner(System.in);
        Integer userYear = 2001;
        LocalDate tarih = LocalDate.of(1996,8,21);
        boolean artikYilMi= tarih.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);//artikYilMi =
        //ki farklı tarihin ay numaralarının toplamını bulunuz.
        LocalDate tarih_1 = LocalDate.of(1932,2,23);
        LocalDate tarih_2 = LocalDate.of(1934,5,22);
        Month date1 = tarih_1.getMonth();
        Month date2 = tarih_2.getMonth();
        System.out.printf("sum = "+ tarih_1.getMonthValue() + tarih_2.getMonthValue());//sum = 7
        //2.yol
        Month sum = Month.of(date1.getValue() + date2.getValue());
        int mothSum= sum.compareTo(tarih_2.getMonth());
        int mothSum2= sum.compareTo(tarih_1.getMonth());
        System.out.println("sum = " + sum);//sum =sum = JULY
        System.out.println("sum = " + (mothSum+mothSum2));//sum =sum = 7
        //3. Yol
        LocalDate date3= LocalDate.of(1996,4,21);
        LocalDate date4= LocalDate.of(1993,6,29);
        int diffTime = date3.getMonthValue() + date4.getMonthValue();
        System.out.println("diffTime = " + diffTime);//diffTime =10

        // İki farklı tarih için saat farkını bulunuz

        LocalDateTime date5= LocalDateTime.of(1996,4,21,1,56);
        LocalDateTime date6= LocalDateTime.of(1993,6,29,4,1);  //fark
        long diffHour = ChronoUnit.HOURS.between(date6, date5);
        System.out.println(diffHour);//diffHour =
        //Eğer saat i)24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
//            ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
//            iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
//            iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
        int i,j;
        for ( i = 0; i < 24; i++) {
            for ( j = 0; j < 61; j+=30) {
                LocalTime clockTime= LocalTime.of(i,j);
                switch(i){

                }
            }
        }


        LocalTime FiveTime= LocalTime.of(5,0);
        LocalTime eightTime= LocalTime.of(8,0);
        LocalTime sixteenTime= LocalTime.of(16,0);
        LocalTime nineteenTime= LocalTime.of(16,0);
        LocalTime twentyTwoTime= LocalTime.of(16,0);


    }

}
