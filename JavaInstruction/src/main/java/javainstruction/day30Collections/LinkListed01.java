package JavaSunctruction.day30Collections;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkListed01 {
    public static void main(String[] args) {
        LinkedList<String> names =new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        /**/

        String firstEl =names.peek();
        System.out.println(firstEl);
        System.out.println(names);
        LinkedList<String> myList =new LinkedList<>();
        String first = myList.peek();
        System.out.println(first);

        // example 1: A ile başlayan Tüm isimleri "*****" ' e çeviriniz
        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");
        LinkedList<String> reverese=new LinkedList<>();
        for (String w:students) {

            if (w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students);

        //Example 2; List'deki 4 harften cok harf içeren isimleri siliniz

        for (int i=0; i< students.size();i++){
            if (students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);

        HashSet<String> emails= new HashSet<String>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

    }
}
