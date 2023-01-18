package JavaSunctruction.day16arraymultidimensionalarrayslist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /* ArrayList'ler aynı data tipine sahip birden fazla data'yi depolamak için kullanılır.
        * 1-) Array oluştururken Array'in içine kaç tane eleman koymamiz gerektiğini söylemeliyiz,
        *  söylediğimiz eleman sayisindan fazla eleman koyamayiz
        * Array'ler eleman sayisinda "fixed" dirler
        *
        * Arraylist'leri oluştururken eleman sayısı söylemeye gerek yok, ArrayListler eleman sayisindan
        * "flexible" (esnek) dirlar
        * 2-) Arrayler'in içine primitive ve adress(reference), arrayList'lerin içine ise sadece non-primitive Koyulur.
        * 3-) Arraler super faster, cok hizli. Arrayler çok hızlıdır. lenght hakkında eminseniz Array kullanın haftanın
        * günleri gibi ama uzunluğu değişme riski varsa ArrayList kullanmalısın okulun kapasitesi ülkenin illeri gibi */
//        1.yol:
        ArrayList<Integer> numbers=new ArrayList<>();
//        2.yol:
        ArrayList<Integer> heights= new ArrayList<>();
//        3. yol:
        List<Integer> nums =new ArrayList<>();
        //ArrayList'ler nasil yazdırılır.
        System.out.println(nums);//[]
        //ArrayList'lere nasıl eleman eklenir.
        nums.add(32);// add methodu boolean return eder.
        nums.add(23);
        nums.add(45);
        nums.add(16);
        System.out.println("nums = " + nums);// nums = [32, 23, 45, 16]
        nums.add(1,50); //data tipi void olduğu için hiçbirşey return etmez.
        System.out.println(nums);//[32, 50, 23, 45, 16]

        // addAll() bir list'i bir list'teekleyebiliriz

        List<Integer> prices =new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums); //[32, 50, 23, 45, 16, 23, 185]


        // addAll methodunun bir diğer özelliği ise istediğiniz index den list'i ekleyebilirsiniz.
        nums.addAll(2, prices);
        System.out.println(nums);

        //ArrayList'lerin eleman sayisi nasıl bulunur.

        int elementCount=nums.size();
        System.out.println(elementCount);//9

        //ArrayList'lerde herhangi bir eleman nasıl seçilir?
        //get() istenen bir endex deki elemanı verir.
        int el1= nums.get(3);
        System.out.println(el1);

        //Arraylist'in bos olup olmadğini nasıl anlarız.?
        boolean bos1 =nums.isEmpty();
        System.out.println(bos1);//false

        //ArrayList'de bir eleman nasıl değiştirilir.
        nums.set(3,200);
        System.out.println(nums);//[32, 50, 23, *200*, 23, 45, 16, 23, 185] instead of [32, 50, 23, *185*, 23, 45, 16, 23, 185]


        //Example 1: nums Arralist'indeki tum tek sayilari 11 arttırdıktan sonra ekrana yazdırınız.

        for (int w:nums) {
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);
                System.out.print(" "+nums.get(nums.indexOf(w + 11)));
            }
        }
        System.out.println();
        System.out.println(nums);
        //[32, 50, 23, 200, 23, 45, 16, 23, 185]
        //[32, 50, 34, 200, 34, 56, 16, 34, 196]

        //remove() methodu kullanımı
        //remove methodunun içine tam sayı koyarsanız java onu index olarak kabul eder.
        //Example 2: ArrayList'den 200 elemanin ilk görünümünü siliniz.
        nums.remove(new Integer(200)); // Integer üzerindeki çizginin anlamı java derki bu yöntem eski ama
        // çalışır ancak gelecekte bunu kaldıracağım artık bu şekilde yazmamaya alış
        System.out.println(nums);
//        [32, 50, 34, 200, 34, 56, 16, 34, 196]
//          [32, 50, 34, 34, 56, 16, 34, 196]
        //güncel olarak bu şekilde yazılmalıdır
        Integer sayi=196;
        nums.remove(sayi);
        System.out.println(nums);
        //[32, 50, 34, 34, 56, 16, 34, 196]
        //[32, 50, 34, 34, 56, 16, 34]
        /*note 1: tüm tam sayılar java için aksi söylenmediçe primitive 'dir yani "int" dir
        * note 2: "primitive' ler  ArrayList'lerin elemani olmazlar
        * note 3: "primitive" 'i "wrapperClass" 'a çevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin
        *  elemanı olur index olmaz*/
    }
}
