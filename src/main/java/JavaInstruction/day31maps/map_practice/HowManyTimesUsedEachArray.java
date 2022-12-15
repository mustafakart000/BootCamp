package JavaSunctruction.day31maps.map_practice;

import java.util.HashMap;

public class HowManyTimesUsedEachArray {
    public static void main(String[] args) {
        String str="Hellooo";
        harfSayisiBul(str);
        //Get method'una Anlaşılması için bir örnek verelim.
        HashMap<String, Integer> map = new HashMap<>();
        map. put("Ali",32);
        map. put("Ali",2+3);
        System.out.println(map);//{Ali=5} ikinci bir map.put("Ali",2+3) eklediğimizde eski değer
                                            // ile toplamaz onun üzerine yazar
        map.put("Ali", map.get("Ali")+4);//Ancak eski değeri get ile çağırıp yeniyi
        System.out.println(map);

    }
     public static HashMap<String, Integer> harfSayisiBul(String str){
         HashMap<String, Integer> map = new HashMap<>();
         String[] arr=str.split("");
         for (String w:arr) {

             if (!map.containsKey(w)){
                 map.put(w, 1);
             }else {
                 map.put(w, map.get(w)+1);//Burada Get method'u ile Key'i alıp onun Value'sunu 1 arttrıyoruz
                 System.out.println("map.put(w, map.get(w)+1): "+map.put(w, map.get(w)));
             }
         }
         System.out.println(map);
         return map;

     }
}
