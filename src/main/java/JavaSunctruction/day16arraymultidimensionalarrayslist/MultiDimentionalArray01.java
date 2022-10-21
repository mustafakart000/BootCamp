package JavaSunctruction.day16arraymultidimensionalarrayslist;
/*
*Array veya Collection varsa "for-each-loop" kullanmak tercihiniz olsun
*Array veya Collection var ama "index kullanmak zorundasiniz...
         ...o zaman "for-each-loop" calismaz "for-loop" veya "while-loop veya "do-while-loop" kullanmalısınız
 */

import java.util.Arrays;

public class MultiDimentionalArray01 {
    public static void main(String[] args) {
        //bir tane integer multidimensional array oluşturunuz
        //bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;
        for (int[] w: arr){
            for (int k: w){
                sum+=k;
            }
        }
        System.out.println("sum = " + sum);//sum = 248

        //bir multidimensional array'i normal array'e ceviren kodu yazınız.
        //{{2,5,1},{32.75}}==>{2,5,1,32,75}

        int[][] brr={{2,5,1},{32,75}};

        int toplam=0;
        for (int[] w:brr) {
            toplam=toplam+w.length;
        }
        System.out.println("toplam = " + toplam);
        int idx=0;
        int crr[]= new int[toplam];
        for (int[] w: brr) {
            for (int k:w) {
                crr[idx]=k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(crr));





    }
}
