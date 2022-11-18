package JavaSunctruction.Day17ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLİst01 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("tom");
        names.add("thomas");
        names.add("tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[tom, thomas, tahsin, Trump, Taceddin]
        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeALl() kullandığınızda sadece ilk list değişir,
                                // parantezin içindeki list değişmez
        System.out.println(names); //[tom, thomas, tahsin]
        System.out.println(cities);//[Trump, Tom, Taceddin]
        List<String> myNames=new ArrayList<>();

        myNames.add("");
        myNames.add("thomas");
        myNames.add("tahsin");
        boolean sonuc1=names.containsAll(myNames);
        System.out.println(sonuc1);//true


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1: "a" listinde "Shoes" elelmanının ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]
        //Example 2: "a" listinde "Shoes" elelmanının tüm görünümlerini siliniz.
        List<String> silinicekler= new ArrayList<>();
        silinicekler.add("Shoes");
        a.removeAll(silinicekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        //Example 3: bir tane salary listi oluşturun, eger salary 10000' den az ise %20 10000'den cok ise%10 zam yapiniz.

        List<Double> salary= new ArrayList<>();
        salary.add(12343.0);
        salary.add(7564.0);
        salary.add(15765.0);
        salary.add(9500.0);
        salary.add(20500.0);
        System.out.println(salary);
        for (double w: salary
             ) {
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }
            else {
                salary.set(salary.indexOf(w),w*1.1 );
            }
        }
        System.out.println(salary);
//        Example 4:  iki arrayin eşit olup olmadığını kontrol edip yazınız
        // Note: iki arrayList'in eşit olması için, elemanlar eşit olmalı ve aynı elemanlar aynı index de olmalıdır
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');


        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

                int counter = 0;//flag
                for (int i = 0; i < m.size(); i++) {
                    if (m.size()!=n.size()){
                        counter++;
                        System.out.println("Listler eşitdeğildir");
                        break;
                    }
                    else if (m.get(i) != n.get(i)) {
                        System.out.println("Listler esit degildir");
                        counter++;
                        break;

                    }

                }if (counter == 0) {
            System.out.println("listler eşittir");
                }


            //2.yol:
        boolean esitmi = m.equals(n);
        if(esitmi){
            System.out.println("Listler eşittir");
        }
        else {
            System.out.println("Listler eşit değildir");
        }
        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
//           [2, 3, 2, 2, 5] ==> [2, 3, 5]


        Scanner scan= new Scanner(System.in);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(2);
        sayilar.add(5);
        List<Integer> newSayilar=new ArrayList<>();
        newSayilar.add(2);
        newSayilar.add(3);
        newSayilar.add(7);
        newSayilar.add(4);
        newSayilar.add(5);
        int c,b;
        for (int i=0; i< a.size(); i++) {
            c=sayilar.lastIndexOf(sayilar.size());
            b=sayilar.indexOf(i);
            if (c==b){
                newSayilar.add(c);
            }
        }System.out.println(newSayilar);




        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]
        List<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(3);
        a1.add(2);
        a1.add(2);
        a1.add(5);

        List<Integer> yeni = new ArrayList<>();
        // [2, 3, 2, 2, 5]
        for(Integer w : a1){
            if(!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);// [2, 3, 5]

        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        Scanner input = new Scanner(System.in);

        String harf = "";

        List<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("K");
        c1.add("R");
        c1.add("S");

        do {
            System.out.println("Lutfen bir harf giriniz");
            harf = input.next().substring(0, 1);

            if (c1.contains(harf)) {
                c1.set(c1.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c1.add(harf);
            }
            System.out.println(c1);
        }while(!harf.equals("Q"));



    }
}


