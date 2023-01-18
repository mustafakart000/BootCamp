package JavaSunctruction.practice_bootCamp;

import java.util.Scanner;

public class For_Continue {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);

        double toplam=0;
        for (int i=0; i<6; i++) {
            System.out.println("Bir sayı giriniz");
            double sayı= scan.nextDouble();
            if (sayı>5 && sayı<10){
                System.out.println("girdiğiniz sayı 5 ile 10 arasında olduğu için işleme alınmayacak");
                continue;
            }
            toplam+=sayı;

            }
        System.out.println("toplam = " + toplam);//toplam=""


        }

    }

