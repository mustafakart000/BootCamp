package PracticeAdvenced.practice01.Practice05;

public class Q05Market_Constructor {
    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..
    public static void main(String[] args) {
        Market urunObjesi = new Market("Ekmek", 5, "12.11.2023");
        System.out.println("urunun Adi: "+ urunObjesi.urunAdi+" Urun fiyari: "+urunObjesi.urunfiyat+" Son kullanma Tarihi: "
                                        +urunObjesi.sonKullanmaTarihi);
    }
}