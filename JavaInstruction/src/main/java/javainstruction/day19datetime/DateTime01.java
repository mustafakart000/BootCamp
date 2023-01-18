package JavaSunctruction.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1:Anlik tarihi(current date) ekrana yazdıran kodu yazınız.
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);//currentDate = 2022-10-21

        //Example 2:Anlik zamani (current time) ekrana yazdıran kodu yazınız.
        LocalTime currentTime =  LocalTime.now();
        System.out.println("currentTime = " + currentTime);//currentTime = 20:45:55.571410400

        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);//currentDateTime = 2022-10-21T20:45:55.572407600

        //Example  4: Japonya'daki Anlik tarihi (current Date) ve "Anlik zamani "()

        LocalDateTime currentDateTimeJapan=  LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentDateTimeJapan = " + currentDateTimeJapan);

        LocalDateTime currentDateTimeIstanbul= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("currentDateTimeIstanbul = " + currentDateTimeIstanbul);

        //Example 6: Bugunden 789 gun sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız
        LocalDate countDate=LocalDate.of(2022, 10, 21);// bu [31]. satırın Amacaı yazdırıken anlaşılmaz
        // çünkü bu satır yarın emeklilik tarihini yeniden hesaplamak için yazlır 789 bugun ise yarın 788 günü kalır.
        // bu yüzden kaç gün kaldıysa o günün tarihini koyariz ki yarın tekrar kaç gün kaldığını biz ona vermeden o bize
        // otomatik versin
        LocalDate currentDate2=  LocalDate.now();
        LocalDate retireDate= currentDate2.plusDays(789);
        System.out.println("retireDate: "+retireDate);//retireDate: 2024-12-18

        //Example 7: Ikı çocugunuzun dogum tarihleri arasindaki farki gün olarak hesaplayan kodu yaziniz.

        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=  LocalDate.of(2013,2,8);
        Long diff= ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println("diff = " + diff);
        //Example   8: Tom Aliden 3 yıl 8 ay 13 sonra doğdu ali ise veliden 1 yıl 15 gün önce doğdu.
        // tomun doğum tarihi 11/18/2011 ise Veli ve Ali nin doğum Tarihlerini Bulunuz.
        System.out.println();
        System.out.println("TOM ALİ VELİ DOB");

        LocalDate dobTom=LocalDate.of(2011,11,18);
        System.out.println("Tom'un Doğum Tarihi = " + dobTom);//dobTom = 2022

        LocalDate aliDogumDate= dobTom.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println("ali nin Doğum Tarihi = " + aliDogumDate);//dobTom = 2022

        LocalDate veliDogumDate= aliDogumDate.plusYears(1).plusMonths(2).plusDays(15);
        System.out.println("Veli nin Doğum Tarihi = " + veliDogumDate);//dobTom = 2022



        System.out.println("TOM ALİ VELİ DOB");
        System.out.println();

        //Example   8:İstanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız

        //29 Mayis 1453 ==> Istanbul'un Fethi  29 Ekim 1923 ==> Cumhuriyetin kuruluşu.

        LocalDate istanbulunFethi= LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulusu= LocalDate.of(1923,10,29);

        Long aySayisi= ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKurulusu);
        System.out.println("aySayisi = " + aySayisi);//aySayisi = 5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }








    }
}
