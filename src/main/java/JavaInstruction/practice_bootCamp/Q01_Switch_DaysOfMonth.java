package JavaSunctruction.practice_bootCamp;

import java.util.Scanner;

public class Q01_Switch_DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yili giriniz: ");
        int year = input.nextInt();
        System.out.println("Ay numarasını giriniz: ");
        int month = input.nextInt();
        int day;
        switch (month) {
            case 1: case 3:
               day =31;
               break;
            case 7: case 8: case 10: case 12:
                day=30;
                System.out.println("Girdiğiniz ayin gün sayısı: "+day);
                break;
            case 4: case 6:
            case 9: case 11:
                if ((year %4== 0 && year % 100 != 0) || year%400==0) {
                    day=29;
                    System.out.println("Artık yıldır.");
                }else {
                    day=28;
                    System.out.println("Girdiğiniz ayın gün sayısı"+day);

                }break;
            default:
                        System.out.println("Gecerli ay numarası giriniz.");


        }

    }
}
