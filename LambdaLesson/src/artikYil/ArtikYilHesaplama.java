package artikYil;

import java.util.Enumeration;
import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {

        //Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
        //
        //Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
        //
        //Formül ;
        //
        //Artık yıllar 4 rakamının katı olan yıllardır: 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        //100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        //Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        //Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil,
        // yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
        //Örnek Çıktı
        //
        //Yıl Giriniz : 2020
        //2020 bir artık yıldır !
        //Yıl Giriniz : 2022
        //2022 bir artık yıldır değildir !

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int numberOne = input.nextInt();
        /*if (numberOne%100==0) {
            if (numberOne%400==0){
                System.out.println("artık yıl");
            }else {
                System.out.println("artıl yıl değil");
            }
        }else if (numberOne%4==0){
            System.out.println("artık yıl");
        }else {
            System.out.println("artık yıl değil");
        }*/

        String result = (numberOne % 100 == 0) ? ((numberOne % 400 == 0) ? ("artık yıl") : ("artık yıl değil")) : ((numberOne % 4 == 0) ? ("artık yıl") : ("artık yıl değil"));
        System.out.println(result);


    }
}
