package PracticeAdvenced.practice.practice09;

import java.util.HashMap;

public class countertotalAlpth01 {
    public static void main(String[] args) {
        System.out.println(harfSayisiBul("Hellooo"));

    }
    public static HashMap<String,Integer> harfSayisiBul(String str) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String arr[] = str.split("");
        for (String w : arr) {
            if (!map.containsKey(w)) {
                System.out.print(" if: "+map.containsKey(w));
                map.put(w, 1);
            } else {
                System.out.print(" else: "+map.containsKey(w));
                map.put(w, map.get(w) + 1);
            }
        }
        return map;
    }
}


