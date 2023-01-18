package CiftSayiBulma;

import java.util.Scanner;

public class CiftSayiBulmaBonus {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.
        //
        //Bonus Geliştirme
        //Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int counter = 0;
        int number = input.nextInt();
        for (int i=1; i<=number; i++){
            counter++;
            if (i%5==0 && i%4==0){
                counter++;
            }

        }








    }
}
