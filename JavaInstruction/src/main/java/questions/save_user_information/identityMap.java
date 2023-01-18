package questions.save_user_information;

import java.util.HashMap;
import java.util.Scanner;

public class identityMap {
//-----------------------------------------------Class Variables--------------------------------------------------------
    static HashMap<String, String> person = new HashMap<>();
    static Scanner scan=new Scanner(System.in);
    public static final String kirmizi = "\u001B[31m";
    public static final String yesil = "\u001B[32m";
    public static final String sari = "\u001B[33m";
    public static final String mavi = "\u001B[34m";
    public static final String mor = "\u001B[35m";
    public static final String beyaz = "\u001B[37m";

//---------------------------------------------------MAİN---------------------------------------------------------------
    public static void main(String[] args) {

            selectOption();

    }
//--------------------------------------------------METHODS-------------------------------------------------------------
    private static void selectOption(){
        System.out.println(sari+"Yapmak istediğiniz işlemi giriniz:\n0:işlemi sonlandırır\n"+"1: kullanici ekle\n" +
                " 2: kullanıcı bilgisi alma"+
                "3:kullanıcı bilgisi.");
        int secim= scan.nextInt();
        switch (secim) {
            case 0:
                cikis();
                break;
            case 1:
                saveInfo();
                break;
            case 2:
                getInfo();
                break;
            case 3 :
                removeInfo();
                break;
            default:
                System.out.println(kirmizi+"yanlis giris yaptiniz tekrar deneyiniz.");
                selectOption();
                break;
        }
    }


     static void cikis() {
        System.out.println(yesil+"Çıkış işleminiz gerçekleşti iyi günler.");
    }


    private static void removeInfo() {
        System.out.println("Silinicek tc'yi giriniz: ");
        String siliniceTc= scan.next();//nextLine hata verir. çünkü bir üst satır println değil print olduğu için
                                        // tum satırı alır
        if (person.containsKey(siliniceTc)) {
            person.remove(siliniceTc);
            System.out.println("Girinlen tc'e kaydı silinmiştir:  "+person);//Silinecek TC nin tüm bilgilerini person
                                                    // map'inden getirdik(map.get(key); Tüm değerleri value getirir.)
        }else {
            System.out.println("aradiğiniz tc sahip sahis yoktur.\n tekrar deneyin ");//2.adım
            removeInfo(); //kullanıcı,silinenTc ye sahip şahıs olmadığı için tekrar tc giriş için
            selectOption();
        }
    }


    private static void getInfo() {
        System.out.println("Aradiğniz tc'yi giriniz: ");
        String arananTc= scan.next();//nextLine hata verir. çünkü bir üst satır println değil print olduğu için
                                    // tum satırı alır
        if (person.containsKey(arananTc)){
            System.out.println(person.get(arananTc));//arananTc nin tüm bilgilerini person map'inden getirdik.
            // (map.get(key); tüm değerleri value getirir.)
        }else {
            System.out.println("aradiğiniz tc sahip sahis yoktur\n tekrar deneyin");
            getInfo();//kullanıcı, arananTc ye sahip şahıs olmadığı için tekrar tc girişi için//kullanıcı var olan tc
            //girişi için saveInfo() metoda geri göndermedik.
            selectOption();
        }


    }
    static void saveInfo() {
        System.out.println("4 haneli tc nizi girin: ");
        String tc= scan.next();///nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        scan.nextLine();//Ard arda scan.nexline çalışınca hata vermemesi için boş bir scan.nextline(); atadık.
        if (person.containsKey(tc)){
            System.out.println("var olan bir tc girdiniz tekrar deneyiniz...");
            saveInfo();//kullanıcı var olan tc girdiğinizde sizi tekrar tc girmeniz için methodun baş tarafına gönderir.
        }else {
            System.out.println("adiniz giriniz: ");
            String name = scan.nextLine();

            System.out.println("Soyadini giriniz: ");
            String surName = scan.nextLine();

            System.out.println("Adres giriniz: ");
            String adress=scan.nextLine();

            System.out.println("tel giriniz: ");
            String phone =scan.nextLine();

            String values =name +" "+ surName +" "+adress +" "+phone;// tc haric verileri bir Stringe atadık.
            person.put(tc,values);//person map'ine tc key olarak diğer bilgiler (name, surname...) value olarak eklendi.
            System.out.println("verilerinizi doğru şekilde girdiniz tebrikler verilerinizi kaydedildi." +
                                                                                " verileriniz: "+person);
            System.out.println("---------        ***********************************        ----------");
            selectOption();
        }

    }
//----------------------------------------------------------------------------------------------------------------------



}
