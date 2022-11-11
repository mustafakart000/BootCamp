package PracticeAdvenced.practice01.Practice06.Again;

import java.util.Scanner;

public class Rasgele_Sifre_Olusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten
        // bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrenin Uzunluğunu belirlemek için Bir sayi giriniz: " );
        int sayi = scan.nextInt();
        String sifre = "";
        String karekterler="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxİndex=karekterler.length();
        int sayac=0;
        while (sayac<sayi){
            int rastgeleİndex = ((int)(Math.random()*maxİndex));
            sifre+= (char) karekterler.charAt(rastgeleİndex);
            sayac++;
        }
        System.out.println("Sifre: "+sifre);




    }
}
