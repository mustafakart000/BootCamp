package questions;

public class Nestend_oop01 {
    public static void main(String[] args) {

        ucgen();
        tersUcgen();
        doubleUcgen();


    }

    public static void tersUcgen() {
        System.out.println("=====================================================");
            /*soru 1)  Asagidaki sekil cizen kodu yaziniz
        . . . .1
        . . . 2
        . . 3
        . 4
        5
          */

        for (int line = 1; line <= 5; line++) {
            for (int i = 0; i <= (-1 * line + 5); i++) {

                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ucgen() {
        /*   *
         * *
         * * *
         * * * *
         * * * * *

         */
        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println("=====================================================");

    }



    public static void doubleUcgen() {
        System.out.println("=====================================================");
        int input1 = 5;
        for (int line = 1; line <= input1; line++) {
            for (int j = 1; j <= (input1 - line); j++) {
                System.out.print("*" + " ");
            }

            for (int k = 1; k <= line; k++) {
                System.out.print("." + " ");
            }
            System.out.println();
        }


    }
}