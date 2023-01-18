package javainstruction.day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        for (String w:myList) {
            w = w +"!";
        }
        System.out.println("For ile myList: "+myList);
        ListIterator<String> itr = myList.listIterator();//Listdeki elemanlar String olduğu için string koyduk ve Iterator list'i guncellemek içindir

        while (itr.hasNext()) {
            String el=itr.next();
            itr.set(el+"!");
        }
        System.out.println("Listİterator ile myList: "+myList);
    }
}
