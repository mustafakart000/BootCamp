package PracticeAdvenced.practice;

public class Q02_Substring_AdSoyadı {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

//        Scanner scan=new Scanner(System.in);
//
//        String nameSurName= scan.nextLine();
//
//        String Splitname=nameSurName.split(" ")[0].substring(0);
//        String Splitname2=nameSurName.split(" ")[1].substring(0);
//
//        System.out.println("Ad soyad = " + Splitname2+" /n"+Splitname);
//          2.yol
//        System.out.println("Ad soyadı giriniz: ");
//        String ad= nameSurName.substring(0, nameSurName.indexOf(" "));
//        String soyad= nameSurName.substring(0, nameSurName.indexOf(" ")+1);
//        System.out.println("soyad = " + soyad);
//        System.out.println("ad = " + ad);

        // example 2: //Bir String değerin belirli sayıda karakter
        // içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        //Bir String değerin ikinci karakterinin belirli bir
        // karakter olup olmadığını kontrol eden bir kod yazınız.
        String str= "sds.s";
        //System.out.println(str.matches(".s")); //==> herhangi bir karekter ile başlayıp "s" harfi ile bitiyor
        System.out.println(str);
        System.out.println("&yjh323sdkl".matches(".*s..."));//True
        System.out.println("&yjh323sdkl".matches(".*s.."));//False
        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("xsd".matches("\\w{3}"));
        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.

        System.out.println("Musta".matches("[a-zA-Z]{5}"));


        System.out.println("En az Altı rakam içeriyor:123456  "+"123456".matches("[0-9]{6,}"));//True: En az Altı rakam içeriyor.
        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda
        //içerip içermediğini kontrol eden bir kod yazınız.


        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan
        // 8 karakter rakam toplam 10 karakter olmali,

        System.out.println("1?.,345678".matches("[1][\\p{Punct}]{3}[0-9]*"));

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//true ==> en fazla 10 karakter(\\w) içeriyor.
// \\w = [a-zA-Z0-9_]
        System.out.println("abcd123".matches("\\w{7,10}"));//true ==> en az 7 karakter(\\w) içeriyor.

// ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?!.12345678".matches("[1][\\p{Punct}]{3}[0-9]*"));




    }
}
