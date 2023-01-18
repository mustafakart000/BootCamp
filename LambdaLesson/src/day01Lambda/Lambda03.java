package day01Lambda;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> menu= new ArrayList<>(Arrays.asList("trileçe","havucDilim","güvec","kokorec",
                "küşleme","arabAşı","waffle","künefe","güvec"));


        alfBykTekrarsz(menu);
        System.out.println();
        alfTekrarsizTersSirali(menu);
        System.out.println();
        chrSayisiBykSirali(menu);
        System.out.println();
        harfSayisi7denAzKontrol(menu);
        System.out.println();
        wIleBaslayanELKontrol(menu);
        System.out.println();
        xIleBitenElKontrol(menu);
        System.out.println();
        charSayisiEnBykElPrint(menu);
        System.out.println();
        ilkHrcSonHrfSiraliPrint(menu);
    }

//----------------------------------------------------------------------------------------------------------------------
// Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.


    public static void alfBykTekrarsz(List<String> yemek){
        yemek.stream().//akış başladı
                map(String::toUpperCase).//elemanların tekrarsız olmasını sağladı
                sorted().//elemanların tekrarsız olmasını sağladı
                distinct().// Tekrarsız
                forEach(t-> System.out.print(t+" "));//print //ARABAŞI GÜVEC HAVUCDİLİM KOKOREC KÜNEFE KÜŞLEME TRİLEÇE WAFFLE
    }

// Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

public static void alfTekrarsizTersSirali(List<String> ikram){

            ikram.stream().
                    map(String::length).//Akış güncelledim kelimelerin sırası
                    sorted(Comparator.reverseOrder()).//ters sıralı
                    distinct().forEach(Lambda01::yazdir);//10 7 6 5
    }
//Task-3: List elemanlarini character sayisina gore kucukten byk e print ediniz.

    public static void chrSayisiBykSirali(List<String> ikram){
        ikram.stream().//Akış sağlandı
                sorted(Comparator.comparing(String::length)).//
                forEach(Lambda01::yazdir);//güvec güvec waffle künefe trileçe kokorec küşleme arabAşı havucDilim

    }

    // ******************************************************************************************
    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

//----------------------------------------------------------------------------------------------------------------------
// Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
public static void harfSayisi7denAzKontrol(List<String>ikram){

    System.out.println(ikram.stream().
            allMatch(t -> t.length() <= 7) ? "List elemanlarının tamamı 7 ve 7den az" : "List elemanlarından herhangi biri yedi harften büyük");
}
// Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

    public static void wIleBaslayanELKontrol(List<String>ikram){
       String a= ikram.stream().
                noneMatch(t-> t.startsWith("w")) ? ("W ile yemek ismi mi olur"):("w ile yemek var.");
        System.out.println(a);
    }
    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.
    public static void xIleBitenElKontrol(List<String> ikram){
        System.out.println
                (ikram.stream().
                        anyMatch(t -> t.endsWith("x")) ? ("x ile başlayabilir") : ("x ile hiç başlamaz"));

    }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void charSayisiEnBykElPrint(List<String> ikram){
         Stream<String> sonIsim= ikram.stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                limit(1);
        System.out.println(Arrays.toString(sonIsim.toArray()));
        /*
        String a= Arrays.toString(sonIsim.toArray());
        System.out.println((a));
        */
    }
    // sonIsim.toArray() --> Stream olan akış Artray e çevrildi
    // Arrays.toString(sonIsim.toArray()) --> Arrayı string yapıya çeviriyor

// Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

    public static void ilkHrcSonHrfSiraliPrint(List<String> ikram){
        ikram.stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//son harfine göre alfabetik sıralandı
                skip(1). // git methodundaki ilk eleman hariç tutuldu
                forEach(Lambda01::yazdir); //kokorec güvec trileçe küşleme waffle künefe havucDilim arabAşı
    }
}
