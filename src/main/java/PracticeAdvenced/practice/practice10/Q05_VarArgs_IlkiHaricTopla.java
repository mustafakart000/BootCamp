package PracticeAdvenced.practice.practice10;

import org.w3c.dom.ls.LSOutput;

public class Q05_VarArgs_IlkiHaricTopla {
     /*
Parametrelerinin ilki hariç  karakter sayılarını toplayan ve
bu toplamı birinci parametrenin karakter sayısıyla çarpan bir method yazınız.
(indeks ve if statement kullanmayınız)
   */
     public static void main(String[] args) {
         totallyChar("Ali", "veli","Sally", "Holly");

     }
     public static void totallyChar(String a, String...b){
         int toplam =0;
         for (String w:b) {
             toplam+=w.length();
         }
         int sonuc=toplam*a.length();
         System.out.println(sonuc);
     }

}
