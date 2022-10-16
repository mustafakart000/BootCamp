package arraylist.arraylistday16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeDay16 {
    public static void main(String[] args) {
        //1.yol:
        ArrayList<Integer> ages=new ArrayList<Integer>();
        //2.yol:
        ArrayList<Integer> heights=new ArrayList<>();
        //3.yol:
        List<Integer> nums= new ArrayList<>();

        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums);//[]
        //ArrayList'lere nasıl eleman eklenir.
        //Add() her zaman elemani en sona ekler. (insertion order (insertion'a bir örnek kitap arasına ayraç koymak))
        nums.add(32);//[32]
        System.out.println(nums);
        ages.add(21);
        ages.add(32);
        ages.add(43);
        ages.add(54);
        ages.add(65);
        System.out.println(ages);//[21, 32, 43, 54, 65]
        //add method'u iki veya tek paremetre olarak kullanabiliriz 1. paremtereye index yazarsak virgül koyduktan sonra
//        elemanı yazmamız gerekir example:
        ages.add(2,99);
        System.out.println(ages);//[21, 32, 99, 43, 54, 65]
        List<Integer> prices=new ArrayList<>();
        prices.add(23);
        prices.add(35);
        System.out.println(prices);//[23, 35]
        nums.addAll(prices);
        System.out.println(nums);//[32, 23, 35]


    }

}
