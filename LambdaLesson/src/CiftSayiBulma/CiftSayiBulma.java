package CiftSayiBulma;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.
        //


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        for (int i=1; i<=number; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }









    }
}
