package JavaSunctruction.day20StringBuilderStringBuffer;

import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Tom, Ali'den 3 yıl 8 ay 13 gün sonra doğdu. Ali ise Veli'den 1 yıl 15 gün önce doğdu.
        // Tom'un doğum tarihi 18 Kasım 2011 ise Veli ve Ali'nin doğum tarihlerini bulunuz.

        LocalDate dobTom = LocalDate.of(2011, Month.NOVEMBER, 18);

        LocalDate dobAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);

        LocalDate dobVeli = dobAli.plusYears(1).plusDays(15);

        System.out.println("Ali: " + dobAli);
        System.out.println("Veli: " + dobVeli);

        String str = "Ali!  13 yasinda  , 15 yasında olduğunu dusunuyorum.";
        String Unspace= str.replaceAll("\\s", "");
        System.out.println("Unspace = " + Unspace);
        System.out.println("Unspace.length() = " + Unspace.length());
        //Örnek8: String da boşluktan farklı kaç karakter kullanılıyor code yaziniz .
        
        
    }
}
