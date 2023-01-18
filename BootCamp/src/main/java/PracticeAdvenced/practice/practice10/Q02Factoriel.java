package PracticeAdvenced.practice.practice10;

public class Q02Factoriel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {

    }
    public static int faktoriyel (int sayi){
        if (sayi==1) {
            return 1;
        }else {
           return sayi*faktoriyel(sayi-1);
        }

    }

}
