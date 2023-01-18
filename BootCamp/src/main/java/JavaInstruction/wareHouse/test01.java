package JavaSunctruction.wareHouse;

import java.util.Arrays;
import java.util.List;

public class test01 {
    static int k=0;
    public static void main(String[] args) {

//        String b="-";
//        String c="";
//        char a= (char) b.charAt(0);
//        for (int i = 0; i <10; i++) {
//            b+=a;}
//        System.out.println(b);

        List<String> strings = Arrays.asList("miktar", "urunAdi", "ureticisi", "id", "birim", "raf");
        for (int i=0; i< strings.size(); i++){
            System.out.println(strings.get(i)+" : "+strings.get(i).length());
        }

    }
}
