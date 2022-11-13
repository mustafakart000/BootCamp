package JavaSunctruction.practice_bootCamp;

import java.util.Scanner;

public class Loop01 {
    //Özel Loop Sorusu:*****

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = scan.nextInt();
        printPrime(n);
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }for (int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }

        }return true;

    } public static void printPrime(int n){
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println("i = " + i);
                }
            }
        }
    }


