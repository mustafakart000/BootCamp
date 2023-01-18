package day16multidimensionalarraysarralists;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

/*
    ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
    Array ile ArrayList'in farki nedir?
    1) Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz,
    ve soyledigimiz eleman  sayisindan fazla eleman koyamayiz.
       Array'ler eleman sayisinda "fixed" dirler.
       ArrayList'leri olustururken eleman sayhisi soylemeye gerek yok, cunku ArrayList'ler
        eleman sayisinda "flexible"dirlar.
    2)Array'lerin icine "primitive" ve "reference" lar konulabilir.
      ArrayList'lerin icine sadece "non-primitive"ler konulur.
    3)Array'ler super fast, cok hizli. Array'ler memory'yi cok az kullanir.
    Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
          eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.
 */
//        1.yol
        ArrayList ages= new  ArrayList();
//        2.yol
        ArrayList heights= new ArrayList();
//        3.yol
        List<java.lang.Integer> nums= (List<java.lang.Integer>) new ArrayList();
//        geneliikle 1. ve 2 yol kullanırız ikisi arasında kısa olan 3. yolu tercih ederiz.

        System.out.println("nums = " + nums);

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);

        nums.add(1,50);
        System.out.println("nums = " + nums);

        List<java.lang.Integer> prices= (List<java.lang.Integer>) new ArrayList();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println("nums = " + nums);
        System.out.println("prices = " + prices);

        nums.addAll(2,prices);
        System.out.println("nums = " + nums);

        //ArrayList'lerin eleman ayisi nasıl bulunur.
        int elemanSayisi= nums.size();
        System.out.println("elemanSayisi = " + elemanSayisi);

        //ArrayList'lerde herhangi bir eleman nasil seçilir?
        // get methodu istenen bir index deki elemanı verir.
        int el1= nums.get(3);
        System.out.println("el1 = " + el1);
        //ArrayList'lerin bos olup olmadığını nasıl anlarız.
        boolean bos1=nums.isEmpty();
        boolean bos2=ages.isEmpty();
        System.out.println("bos1 = " + bos1);
        System.out.println("bos2 = " + bos2);

        //ArrayList'de bir eleman nasil değiştirilir?

        nums.set(2,45);//nums = [21, 50, 23, 185, 18, 20, 23, 185]
        System.out.println("nums = " + nums);//[21, 50, 45, 185, 18, 20, 23, 185]

        nums.subList(5,6);
        System.out.println("nums = " + nums);//[21, 50, 45, 185, 18, 20, 23, 185];;

        //nums arraylistindeki tüm tek sayıları 11 arttırdıktan sonra ekrana yazdırınız.

        for (java.lang.Integer w:nums) {
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11 );
                System.out.println(nums.get(nums.indexOf(w+11)));

            }

        }
        System.out.println("nums = " + nums);//nums = [21, 50, 45, 185, 18, 20, 23, 185]
                                             // nums = [32, 50, 56, 196, 18, 20, 34, 196]


        //Note1: Tüm sayılar java için aksi soylenmektedikçe primitive'dir, yani "int" dir
        //Note2: "primitive ler ArrayList'lerin elemanı olamazlar.
        //Note3: "primitive" i "wrapper Class" çevirirseniz, non-primitive olur
        Integer sayi=200;
        nums.remove(sayi); //remove methodunun içine tam sayı koyarsanız java onu index olarak kabul eder.
        System.out.println("nums = " + nums);/*nums = [32, 50, 56, 196, 18, 20, 34, 196]
                                               nums = [32, 50, 56, 18, 20, 34, 196]*/
    }
}
