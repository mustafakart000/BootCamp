package questions.geometryquestion01;

import java.util.Scanner;

public class Circle extends FormatParrent{
    static double r;
    public double calculateCircle(double r){

       return r*r*Math.PI;
    }
    double scanCircle(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Çember için sayı giriniz: ");
        r=scan.nextDouble();

    return calculateCircle(r);
    }

    /*Aşağıdaki Override edilen method: FormatPArrent Class'ından override ediyoruz virgülden sonra iki basamaktan
    fazlasını göstersin istemiyoruz.Eğer farklı bir format belirlemek istersek bu değişikliği FormatParrent Classındaki
     "void displayNumber(double c)" methodundan yapmalıyız ve bu değişiklikten tüm child classlar etkilencektir. */

    @Override
    void displayNumber(double c) {
        c=calculateCircle(r);
        System.out.println("Circle Class Override: "+c);
    }
}
