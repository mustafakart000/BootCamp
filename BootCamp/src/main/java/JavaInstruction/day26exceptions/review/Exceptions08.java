package JavaSunctruction.day26exceptions.review;

public class Exceptions08 {
    public static void main(String[] args) {
            int age=201;
            try {
                printAge(age);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
    }
    public static void printAge(int age){
        if (age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den büyük olamaz ");
        }

            System.out.println(age);
        // PRogram durmalı çünkü işlem yanlış bunun için programı durdurmak için "throw" kullanmalıyız
    }
}
