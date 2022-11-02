package PracticeAdvenced.practice01.Practice05;

public class Hacim_Withreturn {
    public int  hacimHesapla (int a ){
        System.out.print("Küpün Hacmi: ");
        return a*a*a;

    }
    public int  hacimHesapla (int a,int b ){
        System.out.print("Kare Prizması: ");
        return a*a*b;


    }public int  hacimHesapla (int a,int b,int c ){
        System.out.print("DikdörtGen Prizmasnın Hacmi: ");
        return a*b*c;

    }

    public static void main(String[] args) {
        Hacim hacim = new Hacim();
        hacim.hacimHesapla(5);
        hacim.hacimHesapla(6,7);
        hacim.hacimHesapla(9,4,3);
    }
}
