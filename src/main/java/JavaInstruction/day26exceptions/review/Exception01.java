package JavaSunctruction.day26exceptions.review;

public class Exception01 {
    public static void main(String[] args) {
        divide(6,2);//3
        divide(0,2);//0
        divide(6,0);//AritmeticException
    }
    //1.Yol tafsiye edilmez.
    //Bir developer'un tüm matematik kurallarını bilme ihtimali yoktur
    /*
    public static void divide (int a, int b){
        System.out.println(a/b);
        if(b==0){
            System.out.println("Bölen sayı sıfır olamaz");
        }else {
            System.out.println(a/b);
        }
        }
        */

    //Aritmetic Exception.
    public static void divide (int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir hata olustu. "+e.getMessage());
            e.printStackTrace();
            System.out.checkError();
        }
        System.out.println("program çalışmaya devam eder");

    }
}
