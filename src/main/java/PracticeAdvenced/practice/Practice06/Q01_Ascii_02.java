package PracticeAdvenced.practice.Practice06;

import java.util.Scanner;

public class Q01_Ascii_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("İlk karekteri giriniz: ");
        char ch1 = scan.next().charAt(0);
        System.out.println("ikinci Karekteri giriniz: ");
        char ch2 =scan.next().charAt(0);

        int first =Math.min(ch1,ch2);
        int last =Math.max(ch1,ch2);
        String str="";
        for (int i=first; i<=last; i++ ){
            str+=(char) i;
        }
        System.out.println(str);


    }
}
