package PracticeAdvenced.practice.practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniToplaEntrySet {
    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */

    public static void main(String[] args) {

        HashMap<String, Double> urunFiyati = new HashMap<>();
        urunFiyati.put("Kemer", 19.99);
        urunFiyati.put("Gomlek", 29.99);
        urunFiyati.put("Ayakkabi", 89.99);
        urunFiyati.put("Kazak", 24.99);
        urunFiyati.put("Kravat", 19.99);
        System.out.println(fiyatToplami(urunFiyati));
    }
    public static double fiyatToplami(Map<String,Double> map) {
        System.out.println("Urunler ve fiyatlari: " + map);//{Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Gomlek=29.99}
        double toplam = 0;
        for (Map.Entry<String, Double> w : map.entrySet()) {
            toplam += w.getValue();

        }

    return toplam;
   }

}
