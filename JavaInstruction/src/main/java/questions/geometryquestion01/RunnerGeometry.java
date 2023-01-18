package questions.geometryquestion01;

import java.awt.*;

public class RunnerGeometry {
    /* 1-asagidaki hiyararsiye gore class creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare
     sekil <--Üçgen

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
    3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
    */

    public static void main(String[] args) {
        Ractangle rc=new Ractangle();
        Circle crc= new Circle();
        Triangle trA=new Triangle();
        FormatParrent mode = new FormatParrent();
        mode.displayNumber(crc.scanCircle());
        mode.displayNumber(rc.scanRactangle());
        mode.displayNumber(trA.scanTriagle());

    }

}
