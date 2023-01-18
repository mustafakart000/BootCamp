package JavaSunctruction.practice_bootCamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05Delete_Arrays_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
     Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
        System.out.println("Array limitini giriniz: ");
        int limit= scan.nextInt();
        int[] arr=new int[limit];
        for (int i=0; i<limit; i++){
            System.out.println("Giriniz: Indeks "+i);
            arr[i]= scan.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Silmek istediğiniz indeks'i giriniz: ");
        int removeİndex= scan.nextInt();
        int idx=0;
        int[] brr= new int[limit-1];
        for (int i=0; i< arr.length; i++){
            if (removeİndex!=i){
                brr[idx]=arr[i];
                idx++;
            }


        }
        System.out.println(Arrays.toString(brr));

        //2.yol
        List<Integer> numberlist= new ArrayList<Integer>();
        for (int w: arr){
            numberlist.add(w);
        }
        System.out.println("1 "+numberlist);
        System.out.println("Silmek istedğiniz elementin indeksini giriniz: ");
        int removeIdx= scan.nextInt();
        numberlist.remove(removeIdx);//index ile siliyoruz
        System.out.println(numberlist);//[32]
        System.out.println("Silmek istedğiniz elementi giriniz: ");
        numberlist.remove(numberlist.indexOf(scan.nextInt()));// elemntin indeksini alıp siliyoruz.
        System.out.println(numberlist);//[33]




    }
}
