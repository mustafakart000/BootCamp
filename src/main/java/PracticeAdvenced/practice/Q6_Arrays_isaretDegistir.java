package PracticeAdvenced.practice;

import java.util.Arrays;

public class Q6_Arrays_isaretDegistir {
    public static void main(String[] args) {
//Adınızın içerdiği harfleri kullanmadan adınızı yazdıran bir kod yazınız.
      String ad="mustafa";
      int[] arr={ad.length()};
      for (int i = 0; i <ad.length(); i++ ) {
          arr[i] = ad.charAt(i);

      }
        System.out.println(Arrays.toString(arr));


    }
}
