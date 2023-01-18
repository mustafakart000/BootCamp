package PracticeAdvenced.practice.Practice06.Again;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class İnheritance_Hacim_Hesaplama {
    public static void main(String[] args) {
            KarePrizma karePrizma = new KarePrizma();
            double karePrizmaHacmi = karePrizma.hacimhesapla(5,6);
        System.out.println("Kare prizma Hacmi: "+ karePrizmaHacmi);
        Koni koni1= new Koni();
        NumberFormat obj1= new DecimalFormat(".00");
        System.out.println(obj1.format(koni1.hacimhesapla(3,4)));

        Silindir silindir = new Silindir();
        double silindirHacmi= silindir.hacimhesapla(1,5);
        System.out.println(obj1.format(silindirHacmi));
    }
}
