package artikYil;

import java.util.Scanner;

public class CinZodyagi {
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

        if (dogumTarihi%12==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }else if (dogumTarihi%12==1){
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }else if (dogumTarihi%12==2){
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }else if (dogumTarihi%12==3){
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if (dogumTarihi%12==4){
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (dogumTarihi%12==5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }else if (dogumTarihi%12==6){
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if (dogumTarihi%12==7){
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }else if (dogumTarihi%12==8){
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if (dogumTarihi%12==9){
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }else if (dogumTarihi%12==10){
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if (dogumTarihi%12==11){
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }else {
            System.out.println("Geçerli doğum tarihi giriniz");
        }


    }
}
