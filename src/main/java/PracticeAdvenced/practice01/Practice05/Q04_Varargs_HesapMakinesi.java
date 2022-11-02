package PracticeAdvenced.practice01.Practice05;

public class Q04_Varargs_HesapMakinesi {
//Temel 4 matematik işlemi yapan bir kod yazınız.
public static void main(String[] args) {
    HesapMakinesi hesapMakinesi= new HesapMakinesi();
    hesapMakinesi.toplama(1,2,3,4,5,6,7,8,9);
    hesapMakinesi.cikarma(1,2);
    hesapMakinesi.bolme(5,2);
    hesapMakinesi.carpma(9,8,7,6,5,4,3,2,1);
}
}
