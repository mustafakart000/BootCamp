package PracticeAdvenced.practice01;

import java.util.Scanner;

public class DoWhileTahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //      Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //      Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.

        Scanner scan=new Scanner(System.in);
        int count =1, hakSayısı=3;

        System.out.println("0-100 arası tahmini bir sayı girerek sayıyı bulunuz.");
        System.out.println( count+". hakkınızı girininiz: ");
        int sayi= scan.nextInt();
        int rastgelesSayi =(int) (Math.random() * 100 + 1);
        System.out.println("Rasgele sayi giriniz: "+rastgelesSayi);

        do {
            count++;


            System.out.println( (count+1)+". hakkınızı girininiz: ");
            sayi = scan.nextInt();

            if (count<=hakSayısı){
                if (sayi == rastgelesSayi) {
                    System.out.println("Tebrikler");
                    break;
                }
                    }
                 else if (sayi < rastgelesSayi) {
                    System.out.println("daha büyük sayı giriniz");
                } else if(sayi> rastgelesSayi) {
                    System.out.println("Daha kucuk bir sayı giriniz: ");
                }


            if (count==hakSayısı){
                System.out.println("üzgünüm başaramadınızzzz tüm haklarınız doldu");
                break;}



        }while(sayi!=rastgelesSayi && count!=hakSayısı);




    }
}
