package artikYil;

import java.util.Scanner;

public class CinZodyagiSwitch {
    public static void main(String[] args) {

        //Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        //
        //Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
        // normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
        //
        //Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        //
        //Doğum Tarihi %12 = 0 -> Maymun
        //Doğum Tarihi %12 = 1 -> Horoz
        //Doğum Tarihi %12 = 2 -> Köpek
        //Doğum Tarihi %12 = 3 -> Domuz
        //Doğum Tarihi %12 = 4 -> Fare
        //Doğum Tarihi %12 = 5 -> Öküz
        //Doğum Tarihi %12 = 6 -> Kaplan
        //Doğum Tarihi %12 = 7 -> Tavşan
        //Doğum Tarihi %12 = 8 -> Ejderha
        //Doğum Tarihi %12 = 9 -> Yılan
        //Doğum Tarihi %12 = 10 ->At
        //Doğum Tarihi %12 = 11 ->Koyun
        //Örnek Çıktı
        //
        //Doğum Yılınızı Giriniz : 1990
        //Çin Zodyağı Burcunuz : At

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumTarihi = input.nextInt();

        int zodiacHesabi = dogumTarihi%12;

        switch (zodiacHesabi){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.println("Geçerli doğum tarihi giriniz");
        }


    }
}
