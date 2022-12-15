package JavaSunctruction.day26exceptions;

public class Execeptions04 {
    public static void main(String[] args) {

        int age= -25;
        try {
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }

    //Yas'i ekrana yazdiran bir method oluşturunuz.

    public static void printAge(int age){

        if (age<0||age>200){
            throw  new IllegalArgumentException("Yas negatif olamaz.veya 200 den büyük olamaz.");
        }
        System.out.println(age);

    }
}
