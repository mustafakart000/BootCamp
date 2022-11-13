package JavaSunctruction.practice_bootCamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveOtomosyon {




            public static void main(String[] args) throws InterruptedException {

            //URUNLERIN HAZIRLANMASI
            List<String> urunler = new ArrayList<>();
            urunler.add("Su");
            urunler.add("Sicak su");
            urunler.add("Sutlu Filtre Kahve");
            urunler.add("Filtre Kahve");
            urunler.add("Americano");
            urunler.add("Espresso");
            urunler.add("Turk Kahvesi");
            urunler.add("Menengic");

            //FIYATLARIN HAZIRLANMASI
            List<Double> fiyatlar = new ArrayList<>();
            fiyatlar.add(1.00);
            fiyatlar.add(1.50);
            fiyatlar.add(3.00);
            fiyatlar.add(3.00);
            fiyatlar.add(3.00);
            fiyatlar.add(3.00);
            fiyatlar.add(4.00);
            fiyatlar.add(3.50);

            urunler.set(2,"Cappuccino");
            fiyatlar.set(6,15.00);




            //URUN VE FIYATLARIN EKRANDA LISTELENMESI
            System.out.println("No\t\tFiyatlar\t\t\tUrunler");
            System.out.println("----------------------------------------------");

            for (int i = 1; i <= urunler.size(); i++) {
                System.out.print(i);
                for (int j = i - 1; j < i; j++) {
                    System.out.println("\t\t" + fiyatlar.get(j) + "€" + "\t\t\t\t" + urunler.get(j));
                }
            }








            //KULLANICIDAN ALMAK ISTEDIGI URUNUN BILGISI
            Scanner input = new Scanner(System.in);
            System.out.println("\nLutfen almak istediginiz urun no giriniz");
            int no = input.nextInt();








            //SEKER BILGISI
            String cevap = "";

            if (no != 1 && no != 2) {

                System.out.println("Seker ister misiniz? E/H");
                cevap = input.next();
            }


            if (cevap.equalsIgnoreCase("E")) {

                String fazlaSeker = "";
                int counter = 1;

                while (!fazlaSeker.equalsIgnoreCase("H")) {

                    System.out.println("Lutfen seker miktarini seciniz 1,2,3,4");
                    int miktar = input.nextInt();

                    if (counter==3){
                        System.out.println("Sagliginiz icin daha fazla seker secimini izin verilmemektedir.");
                        break;
                    }

                    System.out.println("Daha fazla eklemek ister misiniz? E/H");
                    fazlaSeker = input.next();

                    counter++;

                }

            }







            //URUNUN BEDELININ BELIRLENMESI
            double fiyat = 0;
            double girilenMiktar=0;

            for (int i = 1; i <= urunler.size(); i++) {
                if (no==i){
                    fiyat = fiyatlar.get(i-1);
                    break;
                }
            }
            System.out.println("Odemeniz gereken toplam tutar = " + fiyat + "€");








            //ODEMENIN ALINIP ICECEGIN HAZIRLANMASI
            do {
                fiyat-=girilenMiktar;
                System.out.println("Lutfen paranizin miktarini giriniz 1,5,10,20");
                girilenMiktar= input.nextDouble();
                if (girilenMiktar == 1 || girilenMiktar == 5 || girilenMiktar == 10 || girilenMiktar == 20) {

                    if (fiyat>girilenMiktar) {
                        System.out.println(fiyat-girilenMiktar + "€ daha girmeniz gerek");
                    }else if (fiyat<girilenMiktar) {
                        System.out.println(girilenMiktar-fiyat + "€ para ustunuz var");
                        System.out.println("Iceceginiz hazirlaniyor...");
                        Thread.sleep(3000);
                        System.out.println("Afiyet olsun");


                    }else if (fiyat==girilenMiktar) {
                        System.out.println("Iceceginiz hazirlaniyor...");
                        Thread.sleep(3000);
                        System.out.println("Afiyet olsun");

                    }
                }else {
                    System.out.println("Sadece 1,5,10 veya 20 € ile odeme yapabilirsiniz");
                    girilenMiktar=0;
                }



            }while (!(girilenMiktar>=fiyat));




        }

}
