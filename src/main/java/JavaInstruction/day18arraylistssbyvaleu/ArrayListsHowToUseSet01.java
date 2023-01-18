package JavaSunctruction.day18arraylistssbyvaleu;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsHowToUseSet01 {
    public static void main(String[] args) {
        // Example 1: Bir integer ArrayList'teki 7 hariç elemanları iki arttırınız.

        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {
            if (w==7){
                continue;
            }
            //w=w+2; ==>List'ler boyle update edilemezler.
            ages.set(ages.indexOf(w), w+2 );
        }
        System.out.println(ages);

        //size verilen arrayList'de 8 ve 8 den önceki tüm elemanları iki katına çıkarınız.

        List<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        for (Integer w : nums) {
            nums.set(nums.indexOf(w), w*2);
            if (w == 8) {
                break;
            }


        }System.out.println(nums);



    }
}
