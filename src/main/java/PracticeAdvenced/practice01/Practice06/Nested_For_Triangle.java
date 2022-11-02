package PracticeAdvenced.practice01.Practice06;

import java.util.Scanner;

public class Nested_For_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz: ");
        int satir= scan.nextInt();
        for (int i = 0; i < satir; i++) {
            for (int bosluk = satir - i; bosluk > 1; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<=i; yildiz++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
