package javainstruction.day31maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap01Practice {
    public static void main(String[] args) {
        HashMap<String, Integer> ageList = new HashMap<>();

        ageList.put("Ali", 32);
        ageList.put("Veli", 27);
        ageList.put("mahmut", 45);
        ageList.put("kemal", 36);
        System.out.println(ageList);//{mahmut=45, Veli=27, kemal=36, Ali=32}

        //get() methodu size key karşılığında gelecek değeri verir.
        Integer a = ageList.get("Veli");//Output: 27   ageList.put("Veli",27);
        System.out.println(a);

        // ageList.isEmpty(); bize Listenin boş olup olmadığını false true olarak döndürür.
        System.out.println(ageList.isEmpty());//false

        //Clone methodu ve atama methodu ile Entry'leri kopyalama İçeriğine tam karşılık gelmesi ile clone'lar yani
        // reference adresi ile birlikte kopyalar.
        HashMap<String, Integer> ageList2;
        HashMap<String, Integer> ageList3;
        ageList2 = ageList;
        System.out.println("New ageList2 by using assigment: " + ageList2); //New ageList2: {mahmut=45, Veli=27, kemal=36, Ali=32}
        ageList3 = (HashMap<String, Integer>) ageList2.clone();
        System.out.println("New ageList3 by using clone() Method: " + ageList3);//New ageList3: {mahmut=45, Veli=27, kemal=36, Ali=32}
        Integer c=32;
        HashMap<String, Integer> ageList4;
//        ageList3.compute(ageList2.containsKey("Ali") ? 32,69);





    }
}
