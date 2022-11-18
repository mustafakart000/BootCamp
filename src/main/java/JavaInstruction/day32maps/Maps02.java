package JavaSunctruction.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //Size verilen bir kelimedeki kullanılan Harflerin kaçar kere kullanıldığını gösteren kodu yazınız.
        //abbcaa ==> a=3, b=2, c=1

            String kelime="abbcaa";
            String[] harfler=kelime.split("");
            HashMap<String, Integer> gorunum=new HashMap<>();
            System.out.println(Arrays.toString(harfler));
            for (String w: harfler){
                Integer gorunumSayısı =gorunum.get(w);
                if (gorunumSayısı==null) {
                    gorunum.put(w,1);
                    }
                else {
                    gorunum.put(w,gorunumSayısı+1);
                }

            }




    }
}
