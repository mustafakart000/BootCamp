package JavaSunctruction.practice_bootCamp;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        //1.yol:
//        System.out.println("Bir sayı giriniz: ");//120 için
//
//        int user= scan.nextInt();
//        int bolSayılar= 0;
//
//        for (int i=11; i<=user; i++){
//            if (i%4==0 && i%6==0){
//                System.out.print(i+" "); // 12 24 36 48 60 72 84 96 108 120
//            }
//        }
//
//        //2.yol:
//
//        String s="";
//        int i=120;
//
//        while (i>10){
//            if (i%4==0 && i%6==0){
//                s=s+i+" ";
//            }
//            i--;
//        }
//
//        System.out.println();
//        System.out.println(s);
//
//        //3. Yol:
//        String s1   = "";
//        Integer i1 = 120;
//
//        do{
//            if (i1%4==0 && i1%6==0){
//                s1=s1+i1+" ";
//            }
//            i--;
//        }while (i>10);

        // Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        String s3 = "accessories";
        String d1 = "";
        String d2 = "";
        for (int k = 0; k < s3.length(); k++) {
            String s4 = s3.substring(k, k + 1);


            if (s3.indexOf(s4) != s3.lastIndexOf(s4)) {


                d2 = d2 + s4;

                if (!d1.contains(s4)) {


                    d1 = d1 + s4;
                }
            }
        }

        System.out.println("d1 = " + d1);//d1 =
        System.out.println("d2 = " + d2);//d1 =

//        2. YOl
        String str = "accessories";
        String getStr = "";
        int i = 0;
        String subStr;
        do {
            subStr = str.substring(i, i + 1);
            if (str.indexOf(subStr) != str.lastIndexOf(subStr)) {
                if (!getStr.contains(subStr)) {
                    getStr += subStr;
                }
            }
            i++;
        } while (i < str.length());
        System.out.println(getStr);
        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.


    }
}