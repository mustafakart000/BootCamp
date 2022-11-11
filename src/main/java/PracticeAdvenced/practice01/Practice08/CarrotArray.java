package PracticeAdvenced.practice01.Practice08;

import java.util.Scanner;

public class CarrotArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int uV= scan.nextInt();
        for (int i=0; i<uV; i+=2){

                for (int k=0; k<=i; k++){
                System.out.print(" ");
                }for (int j=0; j<uV-i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
