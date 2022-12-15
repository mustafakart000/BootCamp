package JavaSunctruction.Day17ArrayList;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class ArrayList03 {
    public static void main(String[] args) {
       //Example 1: List'teki elemanlardan birbirine yakin olan iki sayıyı bulunuz.


        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(16);
        a.add(21);

        Collections.sort(a);//List'teki elemanlari kucukten
        // buyuge dizebilmek için kullanılır
        System.out.println("a = " + a);

        int minFark= Integer.MAX_VALUE;

        for (int i=1; i<a.size();i++){
            minFark=Math.min(minFark, a.get(i)-a.get(i-1));

        }
        System.out.println(minFark);
        int[] dizi={9,3,7,1,6,4,1};
        Arrays.sort(dizi,1 ,4);
        System.out.println(Arrays.toString(dizi));
    }
}
