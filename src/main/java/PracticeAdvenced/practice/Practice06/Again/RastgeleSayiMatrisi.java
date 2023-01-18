package PracticeAdvenced.practice.Practice06.Again;

import java.util.Scanner;

public class RastgeleSayiMatrisi {
    public static void main(String[] args) {
        /*

 Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip
 alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

 Input: 10

 Output:
 1 0 0 1 1 0 0 0 1 1
 0 0 1 0 1 0 1 0 0 0
 0 1 0 1 0 0 0 0 0 1
 1 1 1 0 0 0 0 1 1 1
 1 1 0 1 1 1 0 1 0 0
 1 0 0 0 1 1 0 0 0 0
 0 0 1 0 0 0 0 1 1 1
 1 1 0 1 0 1 0 0 1 0
 0 0 1 0 0 0 0 1 1 0
 1 1 1 0 0 1 1 1 1 0
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz: ");
        int satir = scan.nextInt();

        for (int i =0; i <= satir; i++){
            System.out.println();
            for (int j = 0; j <= satir; j++){
                double sayi = Math.random();
                System.out.print(sayi+" ");
                int sayi2 =(int) (sayi*2);
                System.out.print("("+sayi2+") ");
            }
        }


    }
}
