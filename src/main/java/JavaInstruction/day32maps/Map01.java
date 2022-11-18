package JavaSunctruction.day32maps;

import java.util.HashMap;

public class Map01 {
    public static void main(String[] args) {
        //Size verilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız.

        //"I like to move it move it ==> I=1, like=1, to=1 move=2, it=2;

        String str="I like to move it move it";

        str=str.replaceAll("[\\p{Punct}]","");
        System.out.println(str);
        //kelimeleri almak için split methodu kullanmamız gerekir
        String kelimeler[]=str.split(" ");

        HashMap<String, Integer> gorunum= new HashMap<>();

        for (String w:kelimeler) {
            Integer gorunumSayisi=gorunum.get(w);
            if (gorunumSayisi==null){
                gorunum.put(w,1);
                System.out.println(gorunum);
            }else {
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);


    }
}
