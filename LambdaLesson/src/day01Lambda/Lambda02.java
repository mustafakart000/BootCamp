package day01Lambda;


import java.util.*;


public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> sayi= new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));
        ciftKarePrint(sayi);
        tekKupBirFazlaPrint(sayi);
        ciftKarekok(sayi);
        maxElBul(sayi);
        structuredMaxElBul(sayi);
        ciftCarp(sayi);
        ciftEnBuyuguBul(sayi);
        minBul(sayi);
        toplamBirDeger(sayi);
        bestenBykTekKck(sayi);
        cftElKareleriAl(sayi);
    }

//----------------------------------------------------------------------------------------------------------------------
    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer> sayi){
        sayi.stream().
                filter(Lambda01::ciftBul).//Akıştaki çift sayıları filtreledim
                map(t->t*t). //16,4,36....225 map şunu sağlar Stream deki elamanları farklı bir işleme tabi tutabiliriz
                forEach(Lambda01::yazdir);
    }

    //----------------------------------------------------------------------------------------------------------------------
// Task-2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda
// aralarina bosluk birakarak print ediniz

    public static void tekKupBirFazlaPrint(List<Integer> sayi){
        sayi.stream(). //(4,2,6,11,-5,7,3,15)
                filter(t->t%2!=0).//11,-5,7,3,15
                map(t->(t*t*t)+1). // Bu noktadan itibaren sayıların küplerinin +1'ini al akışını sağla
                forEach(Lambda01::yazdir);
    }
//----------------------------------------------------------------------------------------------------------------------
    // Task-3 : Functional Programming ile listin cift elemanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz.

    public static void ciftKarekok(List<Integer> sayi){
        sayi.stream().
                filter(Lambda01::ciftBul).
                map( Math::sqrt). //double
                forEach(t->System.out.print(t+ " "));
    }
//----------------------------------------------------------------------------------------------------------------------
    //task-4: List'in en büyük elemanini yadiriniz.
    public static void maxElBul(List<Integer> sayi){
        Optional<Integer> maxSayi= sayi. //Java 8 ile Optional eklendi. Integer olan bir değere null atanamaz bu yüzden
                                        // nullpointerexception almamak için java 8 ile  optional genereik yapılar eklendi
                stream().
                reduce(Math::max);//Eğer benim result değeerim tek bir değer ise bu durumda reduce terminator değeri kullanılır
        System.out.println(maxSayi);
    }
    //Structured Yapı ile çözelim
    public static void structuredMaxElBul(List<Integer> sayi){
        int max =Integer.MIN_VALUE;
        System.out.println("Max = "+max);
        for (int i=0; i<sayi.size();i++){
            if (sayi.get(i)>max) max= sayi.get(i);
        }
        System.out.println("max = " + max);
    }
//----------------------------------------------------------------------------------------------------------------------
// Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftEnBuyuguBul(List<Integer> sayi){
        System.out.println(sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(a -> a * a).
                reduce(Integer::max)); //Math::max'a göre daha hızlı çalışır.
    }
// Task-6: List'teki tum elemanlarin toplamini yazdiriniz. Lambda Expression...
      /*
        * a ilk degerini her zaman atanan degerden (ilk parametre) alır,
            bu örnekte 0 oluyor
        * b degerini her zamana  stream()'dan akısdan alır
        * a ilk degerinden sonraki her değeri action(işlem)'dan alır

        */

    public static void toplamBirDeger(List<Integer> sayi){

        sayi.
                stream().
                reduce( Integer::sum); //reduce(0,(a,b)-> a+b)

    }

//----------------------------------------------------------------------------------------------------------------------
    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.

    public static void ciftCarp(List<Integer> sayi){
        System.out.println(sayi.stream().
                filter(Lambda01::ciftBul).
                reduce(Math::multiplyExact));//reduce(1,(a,b)-> a*b)
    }
//----------------------------------------------------------------------------------------------------------------------
// Task-8 : List'teki elemanlardan en kucugunu  print ediniz.
    public static void minBul(List<Integer> sayi){
        System.out.println(sayi.stream().
                reduce(Integer::min));
    }
    //2. yol
    public static int byMiracMin(int a, int b){
        return (a<b) ? a:b;
    }

//----------------------------------------------------------------------------------------------------------------------
// Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.


    public static void bestenBykTekKck(List<Integer> sayi){
        System.out.println("bestenBykTekKck: "+
                sayi.stream().
                        filter(t -> t > 5 && t % 2 == 1).
                        reduce(Integer::min));
    }

//----------------------------------------------------------------------------------------------------------------------
// Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void cftElKareleriAl(List<Integer> sayi){
        sayi.stream().
                filter(t-> t%2==0).//akış içindeki çift sayıları aldım.
                map(t->t*t). //sayıların karesi ile yeni bir akış oluşturdum.
                sorted().//akış içindeki sayıları natural-order olarak sıraladım
                forEach(Lambda01::yazdir);//Akıştaki sayıları ekrana yazdım.
    }

}
