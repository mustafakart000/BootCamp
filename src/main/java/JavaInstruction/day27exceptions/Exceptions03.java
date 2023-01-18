package JavaSunctruction.day27exceptions;

public class Exceptions03 {
    /*
    1)Java Exception'lar oluşturarak Developer'ların Java kurallarına uymalarını temin etmiştir.
    2)Biz de Application üretirken kendi Exception'larımızı oluşturarak diğer Developer'ların bizim ortaya koyduğumuz kurallara uymalarını temin ederiz.
    3)Java'nın değil, Bizim ürettiğimiz Exception'lara "Custom Exception" denir.
 */
    public static void main(String[] args) throws IllegalGradeException, IllegalNameException {

        CheckNameFormat("aslı");
        printGrades(120);

    }
    //Ogrenci Notlarını Yazdıran bir method Oluşturunuz.

    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade < 0 || grade > 100) {
            throw new IllegalGradeException("Grade 0 dan az 100 den çok olamaz");
        } else {
            System.out.println(grade);
        }
    }

    //Verilen ismin ilk Harfinin büyük harf olmamasi durumunda Exception atan method yaziniz.
    public static boolean CheckNameFormat(String name) throws IllegalNameException {
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {

            return true;
        } else {
            throw new IllegalNameException("Isimler buyuk harfler Başlamalı.");
        }
    }
}