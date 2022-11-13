package JavaSunctruction.practice_bootCamp;
import java.util.Arrays;


public class Q06_Arrays_BelirliToplamiVerenIkililer {
    public static void main(String[] args) {




        /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */

        int[] sayilar = new int[]{4, 6, 5, -10, 8, 5, 20};
        int[] esitSayilar = new int[(sayilar.length) * (sayilar.length)];

        int[] esit = new int[15];
        int idx = 0, idx2 = 0, idx3 = 0;
        for (int i = 0; i < sayilar.length; i++) {


            for (int j = 0; j < sayilar.length; j++) {


                esitSayilar[idx] = sayilar[i] + sayilar[j];                   //idx//[8, 10, 9, -6, 12, 9, 24, 10, 12, 11, -4, 14, 11, 26, 9, 11, 10, -5, 13, 10, 25, -6, -4, -5,

                idx++;
//                if (esitSayilar[idx2]==esitSayilar[idx]){
//                       esit[idx2]+=sayilar[idx];   //[32]
//                         idx2++;                                                   // -20, -2, -5, 10, 12, 14, 13, -2, 16, 13, 28, 9, 11, 10, -5, 13, 10, 25, 24, 26, 25, 10, 28, 25, 40]
//                }


            }


        }

        int[] esitSayilar2 = new int[49];
        for (int i = 0; i < esitSayilar.length; i++) {
            for (int j = 0; j < esitSayilar.length-1; j++) {

                    if (esitSayilar2[i] == esitSayilar[j+1]) {
                        esitSayilar2[i] += esitSayilar[j];
                        idx2++;
                    }



            }

            //[33]

        }
        System.out.println(Arrays.toString(esitSayilar2));

        System.out.println();
        System.out.println(Arrays.toString(esitSayilar));
        Arrays.sort(esitSayilar);
        System.out.println(Arrays.toString(esitSayilar));
    }
}
