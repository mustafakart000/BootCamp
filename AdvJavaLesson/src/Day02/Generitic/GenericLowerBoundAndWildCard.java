package Day02.Generitic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {
        List<Object> ol= new ArrayList<>();
        addElements(ol);
        List<Number> nl = new ArrayList<>();
        addElements(nl);
//        List<Double> dl = new ArrayList<>();
//        addElements(dl); //CTE, Generic öncesi yapılarda RunTE Olurdu


        /*List<String> st = new ArrayList<>();
        printElements(st);*/

//        *****************printObj();***************************
        List<String> strList= new ArrayList<>();
//        printObj(strList); //Compile Time Error CTE
        List<Object> strLis2 = new ArrayList<>();
        printObj(strLis2);
    }
    //Super, Integer'ın parent'lerini getir.
    public static void addElements(List<? super Integer> list){
        // ?: WilCard (Tipi bilinmeyen)
        for (int i=1; i<10; i++){
            list.add(i);
        }
    }
    //WildCard'In bazı sınırlamaları var.
    public static void printElements(List<? /* ? super String */ > listOfUnknown){
        //listOfUnknown.add("Java"); //--> ? dan dolayı dataTürü netleşmeden add methodu gibi
                                    // işlemleri yaptırmaz.
        for (Object w: listOfUnknown) {
            System.out.println(w);
        }
    }

    public  static  void printObj(List<Object> listOfObject)
    {
        listOfObject.add("Java");
        for (Object w:listOfObject) {
            System.out.println(w);
        }
    }
}
