package questions.geometryquestion01;

import java.util.Scanner;

public class Ractangle extends FormatParrent {
    double a,b;

    double calculateRactangle(double a, double b){
        return a*b;
    }
    double scanRactangle(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Dikdörtgen için bir kenar giriniz");
        a=scan.nextDouble();
        System.out.println("Dikdörtgen için bir kenar daha giriniz");
        b=scan.nextDouble();
        System.out.println(calculateRactangle(a,b));


        return calculateRactangle(a,b);
    }
/* FormatPArrent Class'ından override ediyoruz virgülden sonra iki basamaktan fazlasını göstersin istemiyoruz.
   Eğer farklı bir format belirlemek istersek bu değişikliği FormatParrent Classındaki "void displayNumber(double c)"
     methodundan yapmalıyız ve bu değişiklikten tüm child classlar etkilencektir. */
    @Override
    void displayNumber(double c) {
        c=calculateRactangle(a,b);
        System.out.println(c);
    }
}





