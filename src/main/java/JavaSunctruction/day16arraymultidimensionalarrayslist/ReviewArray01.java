package JavaSunctruction.day16arraymultidimensionalarrayslist;

import java.util.Arrays;

public class ReviewArray01 {
    public static void main(String[] args) {
        //Bir tane İnteger multidimensional array oluşturunuz.
        //Bu array'deki tum sayilarin toplamini veren kodu yazınız.
        int arr[][]={{2, 5, 1}, {32, 75},{13,21,43,56}};
        int sum = 0;

        for (int[] w: arr) {
            for(int k: w){
                sum=sum+k;
            }
        }
        System.out.println(sum);


        int brr[][]={{2, 5, 1}, {32, 75},{13,21,43,56}};

        int toplam=0;
        for(int[] w: brr) {
            toplam = toplam + w.length;
        }
        int idx = 0;
        int crr[]= new int [toplam];
        for(int[] w: brr) {
            for (int k : w) {
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
        System.out.println("toplam Eleman sayısı= " + toplam);
    }
}
