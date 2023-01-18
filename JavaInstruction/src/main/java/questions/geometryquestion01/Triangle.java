package questions.geometryquestion01;

import java.util.Scanner;

public class Triangle extends FormatParrent{

    double calculateTriagle(double a, double b){
        return a*b/2;
    }

    double scanTriagle(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ucgen için bir değer giriniz: ");
        double a= scan.nextDouble();
        System.out.println("Ucgen için bir değer daha giriniz: ");
        double b= scan.nextDouble();
        return calculateTriagle(a,b);
    }

    @Override
    void displayNumber(double c) {
        c=scanTriagle();
        System.out.println("ucgenin Alanı: " +c);
    }
}
