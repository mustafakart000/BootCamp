package PracticeAdvenced.practice01.Practice05;

import java.util.Scanner;

public class Q02_NestedForUcgen {
    public static void main(String[] args) {
         /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
    Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz: ");
        int satir=scan.nextInt();


        for(int i=0; i<satir; i++){//Satır kontrolü

            for (int bosluk=satir-i; bosluk>1; bosluk--){

                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("* ");
            }
            System.out.println();


}

    }
}
