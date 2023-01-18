package JavaSunctruction.practice_bootCamp;

import java.util.Scanner;

public class Q01_if_Diskriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("denklemin a, b ve ,c sayılarını sırayla giriniz.");
        double a= input.nextInt();
        double b= input.nextInt();
        double c= input.nextInt();
        double delta= (Math.pow(b,2)-4*a*c);
        if (delta >0) {
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Denklenin iki kökü vardir: x=1 "+x1+" x2= "+x2);

          } else if (delta == 0) {
            double x=-b/(2*a);
            System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin bir kökü vardır: x="+x);
        }else {
            System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin bir kökü yoktur.");

        }

    }
}
