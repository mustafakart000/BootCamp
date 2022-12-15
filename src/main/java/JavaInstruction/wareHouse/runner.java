package JavaSunctruction.wareHouse;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
    WareHouse obj1= new WareHouse(); //String id,String urunAdi,String ureticisi,int miktar,int  birim,int raf
    obj1.getMiktar();
    String urunAd=obj1.urunAdi;
    int miktar = obj1.miktar;
    String ureticisi=obj1.id;
    obj1.tableOrder();
    int id=obj1.birim;
        System.out.println(obj1.loopList);
    }
}
