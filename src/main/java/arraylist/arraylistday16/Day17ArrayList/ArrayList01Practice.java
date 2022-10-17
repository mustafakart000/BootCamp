package arraylist.arraylistday16.Day17ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01Practice {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("aslı");
        names.add("kerem");
        names.add("berna");
        names.add("coskun");
        System.out.println("names = " + names);//names = [aslı, kerem, berna, coskun]

        List<String> cities= new ArrayList<>();

        cities.add("ali");
        cities.add("mehmet");
        cities.add("zeki");
        System.out.println("cities = " + cities); //cities = [ali, mehmet, zeki]

        names.addAll(2, cities);
        System.out.println("names = " + names);// 2. indexden başlar names = [aslı, kerem, ali, mehmet, zeki, berna, coskun]
        names.removeAll(cities);
        System.out.println("names = " + names);// names = [aslı, kerem, berna, coskun] cities removeAll ile silinince
        // cities'e tekrar ekleyelim
        System.out.println("cities = " + cities);
        // index'e göre içinden eleman alma
        String a= cities.get(1);
        System.out.println("cities.get(1) 1. index 2. sıra = " + a);//cities.get(1) 1. index 2. sıra = mehmet
        List<String> myNames= new ArrayList<>();
        myNames.add("aslı");
        myNames.add("kerem");
        myNames.add("coskun");
        boolean sonuc1 =myNames.containsAll(names);

        System.out.println("names = " + sonuc1);
        List<String> c= new ArrayList<>();
        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("Laptop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");
        //Example 1: "a" listinde "Shoes" elelmanının ilk görünümünü siliniz.

        c.remove("Shoes");
        System.out.println("c = " + c);//c = [TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2: "a" listinde "Shoes" elelmanının tüm görünümlerini siliniz.

        List<String> silinicekler=new ArrayList<>();
        silinicekler.add("Shoes");//c = [TV, Radio, Laptop, Shoes, Book, Shoes]
        silinicekler.add("Radio");//c = [TV, Laptop, Book]
        c.removeAll(silinicekler);
        System.out.println("c = " + c);//c = [TV, Laptop, Book]
        System.out.println();
        System.out.println();
        //Example 3: bir tane salary listi oluşturun, eger salary 10000' den az ise %20 10000'den cok ise%10 zam yapiniz.
        List<Double> salary= new ArrayList<>();
        salary.add(12343.0);
        salary.add(7564.0);
        salary.add(15765.0);
        salary.add(9500.0);
        salary.add(20500.0);
        System.out.println("salary = " + salary);

        List<Double> kck=new ArrayList<>();
        List<Double> byk=new ArrayList<>();
        for (double w: salary){
            if (w>10000){
                byk.add(w*1.1);
            } else  {
                kck.add(w*1.2);
            }
        }
        System.out.print("byk = " + byk+"   :   ");
        System.out.println("kck = " + kck);

    }
}
