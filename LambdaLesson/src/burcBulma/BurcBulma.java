package burcBulma;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        //Java ile kullanıcıdan doğum ayı ve gün değerlerini alıp Burcunu hesaplayan program yazınız.
        //
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum ayınızı giriniz : ");
        String dogumAyi = input.next();

        System.out.print("Doğum gününüzü giriniz : ");
        int dogumGunu = input.nextInt();

        if ((dogumAyi.equalsIgnoreCase("Mart") && (dogumGunu>=21 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Nisan")) && (dogumGunu<=20 && dogumGunu>=1)){
            System.out.println("Koç Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Nisan") && (dogumGunu>=21 && dogumGunu<=30)) || (dogumAyi.equalsIgnoreCase("Mayıs")) && (dogumGunu<=21 && dogumGunu>=1)){
            System.out.println("Boğa Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Mayıs") && (dogumGunu>=22 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Haziran")) && (dogumGunu<=22 && dogumGunu>=1)){
            System.out.println("İkizler Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Haziran") && (dogumGunu>=23 && dogumGunu<=30)) || (dogumAyi.equalsIgnoreCase("Temmuz")) && (dogumGunu<=22 && dogumGunu>=1)){
            System.out.println("Yengeç Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Temmuz") && (dogumGunu>=23 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Ağustos")) && (dogumGunu<=22 && dogumGunu>=1)){
            System.out.println("Aslan Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Ağustos") && (dogumGunu>=21 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Eylül")) && (dogumGunu<=22 && dogumGunu>=1)){
            System.out.println("Başak Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Eylül") && (dogumGunu>=23 && dogumGunu<=30)) || (dogumAyi.equalsIgnoreCase("Ekim")) && (dogumGunu<=22 && dogumGunu>=1)){
            System.out.println("Terazi Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Ekim") && (dogumGunu>=23 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Kasım")) && (dogumGunu<=21 && dogumGunu>=1)){
            System.out.println("Akrep Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Kasım") && (dogumGunu>=21 && dogumGunu<=30)) || (dogumAyi.equalsIgnoreCase("Aralık")) && (dogumGunu<=21 && dogumGunu>=1)){
            System.out.println("Yay Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Aralık") && (dogumGunu>=22 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Ocak")) && (dogumGunu<=21 && dogumGunu>=1)){
            System.out.println("Oğlak Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Ocak") && (dogumGunu>=22 && dogumGunu<=31)) || (dogumAyi.equalsIgnoreCase("Şubat")) && (dogumGunu<=19 && dogumGunu>=1)){
            System.out.println("Kova Burcu");
        }else if ((dogumAyi.equalsIgnoreCase("Şubat") && (dogumGunu>=20 && dogumGunu<=28)) || (dogumAyi.equalsIgnoreCase("Mart")) && (dogumGunu<=20 && dogumGunu>=1)){
            System.out.println("Balık Burcu");
        }else {
            System.out.println("Geçerli ay ve gün giriniz");
        }





    }
}
