package PracticeAdvenced.practice.practice10;

import java.util.*;

public class CreateOneOBjectMultiValue {

    public static void main(String[] args) {
            Map<Integer,String> map=new HashMap<>();
            map.put(101,"Ali, Can, java");
            map.put(102,"Veli, Yan, C#");
            map.put(104,"Deli, San, C#");
            map.put(103,"Veli, Can, python");
            String requestLanguage ="C#";
            takeMultiValues(map, requestLanguage);


    }
    public static List<String> takeMultiValues(Map<Integer,String> map, String requestLanguage){
        ArrayList<String> nameLists= new ArrayList<>();
        for(String each: map.values() ){
            String arr[]=each.split(", ");
            if(arr[2].equalsIgnoreCase(requestLanguage)){
                nameLists.add(arr[0]);
            }
        }
        System.out.println(nameLists+" "+requestLanguage+" bilenler");

    return nameLists;}


    //-------------------------------------------------------------------------------------
    /*public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Ali, Can, java");
        map.put(101,"Veli, Yan, c#");
        map.put(101,"Veli, Can, python");
        String requestLanguage ="java";

        System.out.println(takemultiValue(map,requestLanguage));
    }
    protected static List<String> takemultiValue(Map<Integer,String> map,String requestLanguage){
        List<String> nameLists=new ArrayList<>();
        for (String each : map.values()){
            String arr[]=each.split(", ");
            if(arr[2].equalsIgnoreCase(requestLanguage)){
                nameLists.add(arr[0]);
            }
        }
    return nameLists;}*/

}
