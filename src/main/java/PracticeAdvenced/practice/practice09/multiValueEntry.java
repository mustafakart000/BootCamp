package PracticeAdvenced.practice.practice09;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class multiValueEntry {
    public static void main(String[] args) {
        Map<Integer,String> map1 =new HashMap<>();
        map1.put(101,"Ali, Can, Java");
        map1.put(102,"Veli, Yan, java");
        map1.put(103,"Ali, yan, C#");
        String istenenDil="JAVA";
        List<String> isimList=javaBilenler(map1,istenenDil);
        System.out.println(isimList);

    }
    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil){
        List<String>isimListesIn = new ArrayList<>();
        for (String w:map1.values()){
            String arr[]=w.split(", ");
            if (arr[2].equalsIgnoreCase(istenenDil)){
                isimListesIn.add(arr[0]);
            }
        }return isimListesIn;
    }

}
