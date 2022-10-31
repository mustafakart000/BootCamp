package PracticeAdvenced.practice01.PuanTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Takimlar {
    int takimSayisi;
    static int puanSum=  (-1)*3;
    int howMany;

    public void takimlarSay(int takimSayisi) {
        this.puanSum = takimSayisi*(takimSayisi-1);

    }

    public void TakimPuanlari(int puanAl) {

        if (howMany!=( takimSayisi- 1)){
            this.puanSum-=puanAl;
            howMany++;


        }

    }




}
//</editor-fold>
//</editor-fold>
