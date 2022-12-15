package JavaSunctruction.practice_bootCamp;

import java.util.Arrays;

public class Q03_For_EuroDolarToplamı {
    public static void main(String[] args) {
        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
        
        String money = "$1 $12 €34 €56 $45 €78";
        int dolar =0;
        int euro =0;

            String [] arr =money.split(" ");
            System.out.println(Arrays.toString(arr));


            for (String w: arr) {
                if (w.contains("$")){
                    dolar+= Integer.parseInt(w.replace("$",""));
                }
                else {
                    euro+= Integer.parseInt(w.replace("€",""));
                }
            }
            System.out.println("dolar = " +dolar );
            System.out.println("euro = " +euro );
        }

    }

