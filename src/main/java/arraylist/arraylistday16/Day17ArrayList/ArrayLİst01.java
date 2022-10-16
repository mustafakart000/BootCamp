package arraylist.arraylistday16.Day17ArrayList;

import java.util.ArrayList;
import java.util.List;

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
        m.add('y');
        m.add('z');
        m.add('t');

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




    }
}


