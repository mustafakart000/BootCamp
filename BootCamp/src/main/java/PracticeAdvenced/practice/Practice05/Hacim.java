package PracticeAdvenced.practice.Practice05;

public class Hacim {
    public void  hacimHesapla (int a ){
        System.out.print("Küpün Hacmi: ");
        System.out.println(a*a*a);

    }
    public void  hacimHesapla (int a,int b ){
        System.out.print("Kare Prizması: ");
        System.out.println();


    }public void  hacimHesapla (int a,int b,int c ){
        System.out.print("DikdörtGen Prizmasnın Hacmi: "+a*a*b);
        System.out.println(b*a*c);

    }

    public static void main(String[] args) {
        Hacim hacim = new Hacim();
        hacim.hacimHesapla(5);
        hacim.hacimHesapla(6,7);
        hacim.hacimHesapla(9,4,3);
    }
}
