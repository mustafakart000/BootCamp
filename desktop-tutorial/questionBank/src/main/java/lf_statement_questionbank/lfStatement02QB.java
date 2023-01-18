package lf_statement_questionbank;

import java.util.*;

public class lfStatement02QB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        String cutName= "Ca!";
//
//        if (cutName.length()>2){
//            System.out.println("Kısaltma iki karekterden fazla olamaz. ");
//        } if (!cutName.equals(cutName.toUpperCase())) {
//            System.out.println("Kısatlma isimler her zaman büyük harf olmalıdır.");
//        } if (cutName.replaceAll("[^A-Z]","" ).length()>0) {
//            System.out.println("Lütfen harf dışında karekter Girmeyiniz sadece iki harften oluşan"
//            +"büyük karekter giriniz.");
//        }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        System.out.println("ilk sayıyı giriniz: ");
//        double sayi1= scan.nextDouble();
//        System.out.println("ikinci sayıyı giriniz: ");
//        double sayi2= scan.nextDouble();
//        System.out.println("+ / * - yapmak istediğiniz işlemi giriniz: ");
//        String islem= scan.next();
//
//        if (islem.equals("+")){
//            double toplam=sayi1+sayi2;
//
//            System.out.println("İki  sayının toplamı "+sayi1+" + "+sayi2+" = "+toplam);
//
//        } else if (islem.equals("*")) {
//            double carpma=sayi1*sayi2;
//            System.out.println("İki  sayının carpımı "+sayi1+" x "+sayi2+" = "+carpma);
//        } else if (islem.equals("/")) {
//            double bolme=sayi1/sayi2;
//            System.out.println("İki  sayının bolumun sonucu "+sayi1+" / "+sayi2+" = "+bolme);
//        } else if (islem.equals("-")) {
//            double cikarma=sayi1-sayi2;
//            System.out.println("İki  sayının cıkarma sonucu "+sayi1+" - "+sayi2+" = "+cikarma);
//
//        }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        String parola="Slö2l";
//        String dyPasw= parola.length()>8 ? ("Geçerli paralo"):("Geçersiz paralo");
//        System.out.println("dyPasw = " + dyPasw);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        int a=16; int b=16; int c=16;
//        String ucgenTipi = a==b || b==c || a==c ?
//                (a==b && b==c ? ("Eş kenar üçgen"):("İkiz kenar ucgen"))     :("çeşit kenar ucgen");
//        System.out.println("ucgenTipi = " + ucgenTipi);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        int sayi=125;
//    Object sonuc= 5<=sayi%10 ? ("son hane Büyük: "+((sayi/10+1)*10)): ("son hane kucuk: " +((sayi/10)*10));
//        System.out.println("sonuc = " + sonuc);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//    double year=232;
//    double yüz=year/100;
//    double dortYuz=year/400;
//    double dort=year/4;
//    String apex=year%100==0 && year%400==0 ?
//            ("Artık yıl hesabı 400 ve 100 tam bölünebilmelidr: "+yüz+" : "+dortYuz):(year%100==0 && year%4==0)?
//            ("Artık yıl 100'e ve 4'e tam bölünebilmelidir: "+yüz+" : "+dort):("girilen değer artık yıl değildir." +"\n"+
//            " Artık yıl hesabı 400 ve 100 tam bölünebilmelidir veya 100'e ve 4'e tam bölünebilmelidir");
//        System.out.println("apex = " + apex);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        String psw="aiasAsdsyı";
//
//        String r=psw.length()>8 ? (psw.startsWith("i")? ("gecerli i ") : ("gecersiz i ") ) : ((psw.startsWith("K") ?
//                "geçerli K ": "Geçersiz K: "));
//        System.out.println("r = " + r);
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//    String s="242";
//    String kb= s.length()<3 ? "uc basamaklı değil": "uc basamaklı";
//    Integer kbi= Integer.valueOf(s);
//    System.out.println("kbi = " + kbi);
//    System.out.println("kb = " + kb);


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//     int i=24;
//     boolean l=i%2==0;
//     String ct= l==true ? ("sayı çifttir: "+ (i/2)) : ("sayi tektir. : "+ (i));
//     System.out.println(ct);
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//       int a=12;
//        String b= a<0 ? "pozitif değil": "pozitif";
//        System.out.println("b = " + b);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

//        String ayAdi1 ="TEmmUZ";
//        String ayAdi = ayAdi1.toLowerCase();
//
//        switch (ayAdi){
//            case "ocak":
//            case "şubat":
//            case "mart":
//                System.out.println("Kış");
//                break;
//            case "nisan":
//            case "mayıs":
//            case "haziran":
//                System.out.println("bahar");
//                break;
//            case "temmuz":
//            case "ağustos":
//            case "eylül":
//                System.out.println("Yaz");
//                break;
//            case "ekim":
//            case "kasım":
//            case "aralık":
//                System.out.println("Sonbahar");
//                break;
//
//        }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        int ayNo=8;
//        String ayName;
//        switch(ayNo){
//            case 1:ayName="ocak";
//            break;
//            case 2: ayName="şubat";
//            break;
//            case 3: ayName="mart";
//            break;
//            case 4: ayName= "nisan";
//            break;
//            case 5: ayName="mayıs";
//            break;
//            case 6: ayName="haziran";
//            break;
//            case 7: ayName="temmuz";
//            break;
//            case 8: ayName="agustos";
//            break;
//            case 9: ayName="eylül";
//            break;
//            case 10: ayName="ekim";
//            break;
//            case 11: ayName="kasım";
//            break;
//            case 12: ayName="aralık";
//            break;
//            default: ayName="geçersiz numara";
//
//        }
//        System.out.println(ayNo+". ay" + " = " + ayName);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        List<String>gelecekAylar = new ArrayList<>();
//        int ayNo=13;
//        String ayIsim= "ocak";
//
//        switch (ayNo){
//            case 1: ayIsim="ocak";
//                System.out.println("ocak");
//            case 2: ayIsim="şubat";
//                System.out.println("şubat");
//            case 3: ayIsim="mart";
//                System.out.println("mart");
//            case 4: ayIsim="nisan";
//                System.out.println("nisan");
//            case 5: ayIsim="mayıs";
//                System.out.println("mayıs");
//            case 6: ayIsim="haziran";
//                System.out.println("haziran");
//            case 7: ayIsim="temmuz";
//                System.out.println("temmuz");
//            case 8: ayIsim="ağustos";
//                System.out.println("ağustos");
//            case 9: ayIsim="eylül";
//                System.out.println("eylül");
//            case 10: ayIsim="ekim";
//                System.out.println("ekim");
//            case 11: ayIsim="kasım";
//                System.out.println("kasım");
//            case 12: ayIsim="aralık";
//                System.out.println("aralık");
//                break;
//            default:  System.out.println("lütfen geçerli bir ay giriniz ");
//
//
//        }


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//
//        String [] aylar= {"0.indexBos","ocak","şubat","mart","nisan","mayıs",
//                "haziran","temmuz", "ağustos","eylül", "ekim",
//                "kasım", "aralık"};
//
//        int ayNo=8;
//        String ayIndx= aylar[ayNo];
//
//
//        switch (ayNo){
//            case 1:
//                String s = ayIndx;
//
//        }
//
//        for (String w: aylar) {
//            String a=aylar[Integer.parseInt(w)];
//            System.out.println(a);
//        }


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        Scanner input = new Scanner(System.in);
//        System.out.println("Devam eden aylari yazdirmak icin ay numarasini giriniz..");
//        int ayNo = input.nextInt();
//        String gelecekAylar[] = new String[12];
//
//
//        switch (ayNo){
//            case 1: gelecekAylar[0]= "Ocak";
//            case 2: gelecekAylar[1]= "Subat";
//            case 3: gelecekAylar[2]= "Mart";
//            case 4: gelecekAylar[3]= "Nisan";
//            case 5: gelecekAylar[4]= "Mayis";
//            case 6: gelecekAylar[5]= "Haziran";
//            case 7: gelecekAylar[6]= "Temmuz";
//            case 8: gelecekAylar[7]= "Agustos";
//            case 9: gelecekAylar[8]= "Eylul";
//            case 10: gelecekAylar[9]= "Ekim";
//            case 11: gelecekAylar[10]= "Kasim";
//            case 12: gelecekAylar[11]= "Aralik";
//                break;
//            default: break;
//        }
//
//        for(String w : gelecekAylar){
//            if(w == null){
//                continue;
//            }
//            System.out.println(w);
//        }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        System.out.println("cinsiyet olarak kız yada erkek yazınız.");
//        String user= scan.next();
//        String  cinsiyet = null;
//        switch (user){
//            case "kız": cinsiyet="kadın";
//            break;
//            case "erkek": cinsiyet="Adam";
//            break;
//            default:
//                System.out.println("lütfen erkek yada kız olarak cinsiyet yazınız.");
//                break;
//        }
//        System.out.println(cinsiyet);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        int ay=2;
//        int yil=2024;
//        int gunSayisi=0;
//
//        switch(ay){
//            case 1: case 3: case 5:
//            case 7: case 8: case 10: case 12:
//                gunSayisi=31;
//                break;
//            case 4: case 6: case 9: case 11:
//                gunSayisi =30;
//                break;
//
//            case 2:
//                if (((yil%4==0) && !(yil%100==0)) || (yil%400==0)){
//                    gunSayisi=29;
//                }else{
//                    gunSayisi=28;
//                }
//                break;
//
//
//        }
//        System.out.println("gunSayisi = " + gunSayisi);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        System.out.println("lütfen yapcağınız işlem operatörünü seçiniz: ");
//        String islem= scan.next();
//        System.out.println("ilk sayı: ");
//        double ilkSayi= scan.nextDouble();
//        System.out.println("son sayı: ");
//        double sonSayi= scan.nextDouble();
//
//        switch (islem) {
//
//            case "+":
//                System.out.println(ilkSayi + sonSayi);
//                break;
//            case "-":
//                System.out.println(ilkSayi - sonSayi);
//                break;
//            case "/":
//                System.out.println(ilkSayi / sonSayi);
//                break;
//            case "*":
//                System.out.println(ilkSayi * sonSayi);
//                break;
//            default: break;
//        }


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//            /*
//            /*
//     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
//     * musteri karti olup olmadigini sorun
//     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
//     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
//     * alirsa %10 indirim yapan code create ediniz.
//                */
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
//        int adet=scan.nextInt();
//        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
//        double fiyat=scan.nextDouble();
//        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
//        char kart=scan.next().toLowerCase().charAt(0);
//        double toplamFiyat;
//        if(kart=='y'){
//            if(adet>10){
//                fiyat*=0.8;//fiyat=fiyat*0.8
//                toplamFiyat=fiyat*adet;
//                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
//            }else{
//                fiyat*=0.85;
//                toplamFiyat=fiyat*adet;
//                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gerekn miktar: "+toplamFiyat+" TL dir");
//            }
//
//
//        } else if (kart=='n') {
//            if(adet>10){
//                fiyat*=0.85;
//                toplamFiyat= fiyat*adet;
//                System.out.println("%15 indirim hakki kazandiniz.Toplam odemeniz gereken miktar:"+toplamFiyat+" TL dir");
//            }else{
//                fiyat*=0.9;
//                toplamFiyat=fiyat*adet;
//                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "+toplamFiyat+" TL dir");
//            }
//
//        }else{
//            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz.");
//        }
//
//
//
//


//----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------ATM SORUSU-------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//        System.out.println("lütfen şifrenizi giriniz: ");
//        int psw= scan.nextInt();
//        int e=1234;
//        double bakiye= 5000;
//        int pc=1, py=2,bg=3, exit=4;
//        if (psw==e){
//            System.out.println("şifre işleminiz doğrulandı.");
//            //yapıalcak işlemler
//            System.out.println( "Lütfen yapcağınız işlemi seçiniz para çekme 1 yatırma ");
//            int islem= scan.nextInt();
//            double userParaAl=0;
//            double kalan=0;
//            switch (islem){
//                case 1:
//                    System.out.println("çekebileceğiniz maximum bakiye "+bakiye+
//                            " Lütfen çekmek istediğiniz miktarı yazınız: ");
//                    double userParaAl1= scan.nextDouble();
//                     userParaAl=userParaAl1;
//                    if (bakiye<userParaAl){
//                        System.out.println("çekmiş olduğunuz  "+bakiye +"TL'den Fazla para çekemezsiniz.");
//                    }
//                    else {
//                        kalan=bakiye-userParaAl;
//                        System.out.println("çekmiş oldugunuz  "+userParaAl+"TL bakiyeden sonra hesabınız da kalan bakiye "
//                                +kalan+" TL'dir");
//                    }
//
//                    System.out.println("paranız hazırlanıyor...");
//                    System.out.println("paranızı ve kartınızı almayı unutmayınız. ");
//                case 2:
//                    System.out.println("Yatıracağınız Tutarı ekrana yazınız: ");
//                    int yaTutar = scan.nextInt();
//                    int hesebaGecPara=yaTutar;
//                    int countPiece= String.valueOf(yaTutar).length();
//                    while(0!=hesebaGecPara){
//                        int ellilik=0, onluk2=0, yirmilik=0, beslik=0;
//                        int pow1= (int) Math.pow(10,countPiece-1);
//                        int onluk =(yaTutar%100);
//                        System.out.println("onluk = " + onluk+" "+countPiece+"   "+(pow1));
//                        hesebaGecPara=hesebaGecPara-onluk;
//                        if (onluk<100) {
//                            beslik = onluk % 10;
//                            onluk=onluk-beslik;
//                            if (onluk>=50){
//                                ellilik=onluk+(50-onluk);
//                                onluk2=(onluk-50)%20;
//                                yirmilik=onluk-(ellilik+onluk2);
//                            } else if (onluk<50) {
//                                onluk2=(onluk)%20;
//                                yirmilik=onluk-onluk2;
//
//                            }
//                            hesebaGecPara=yaTutar-hesebaGecPara-ellilik-yirmilik-onluk2-beslik;
//                        }
//                        int yzlk=(yaTutar-ellilik-yirmilik-onluk2-beslik);
//                        System.out.println( yzlk/100+" adet "+"100'luk"+" "+ellilik/50+" adet "+"50'lik"+" "+ yirmilik/20+
//                                " adet "+"20'lik"+" "+ onluk2/10 + " adet " +"10'luk  "+ beslik/5 + " adet " +"bes'lik");
//                        System.out.println("Yatırılan toplam tutar: "+yaTutar);
//
//                    }bakiye=bakiye+yaTutar;
//                    System.out.println("bakiye = " + bakiye+" TL");
//            }
//
//        }
//        else {
//            System.out.println("HATA! Lütfen şifrenizi doğru giriniz");
//        }




//----------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------LOOP 1---------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    }
}
