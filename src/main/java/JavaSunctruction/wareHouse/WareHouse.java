package JavaSunctruction.wareHouse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WareHouse {
    static int k=0;
    List<String> loopListnamesTable=new ArrayList<>();
    List<String> loopList = new ArrayList<>();
    String tableValue="";
    static int miktar;
    String id, urunAdi, ureticisi;
    int birim, raf;



    Object getMiktar() {
        String user = null;

        boolean tableQuit;
        do {
//          String ayrac = new String(new char[2]).concat("  -  ");
            Arrays.asList(id, urunAdi, ureticisi, birim, miktar, raf);
            List<String> loopListnames = new ArrayList<>(Arrays.asList("id", "urunAdi", "ureticisi", "birim", "miktar",
                    "raf","Çıkmak İçin Q'ya basınız Devam etmek için Enter'a basınız."));
            Scanner scan = new Scanner(System.in);
            for (String w : loopListnames) {
                System.out.print(w + ": ");
                user = scan.nextLine();
                loopList.add(loopListnames.indexOf(w), user);
            }
            tableHead();
            System.out.println();

            tableQuit= user.equals("Q");
        } while (tableQuit!=true);

        loopList.remove("Q");
//        System.out.println("\n\n");
        return user;
    }


    String tableHead() {
        String head = "";
        int counter = 0;
        for (int i = 0; i < 6; i++) {
           loopListnamesTable = (Arrays.asList("id", "urunAdi", "ureticisi", "birim", "miktar", "raf"));
            head += loopListnamesTable.get(i) + " |---|";
        }
        if (counter != 1) {
            System.out.println(head);
            counter += 1;
        }
        return head;
    }

    String tableOrder(){

        for (String w: loopList){
            tableValue+=w+space01();
        }
        System.out.println(tableValue);
        return tableValue;
    }
    String space01(){
        String b="-";
        char a= (char) b.charAt(0);
        for (int i = 0; i <counterLoopList(); i++) {
            b+=a;
        }
        return b;
    }

    Integer counterLoopList(){
            int counterF=0;
            if (loopListnamesTable.size()>k){
                counterF=8+loopListnamesTable.get(k).length();
                System.out.println(loopListnamesTable.get(k)+" : "+ loopListnamesTable.get(k).length());
                k++;
            }

        return counterF;
    }


}