package Day03_Practice.creation;

/*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci

2) Threadler 2 şekilde oluşturulur:

        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.
2a) Hangi yöntem daha kullanışlı?
    Genellikle Runnable interfaceini implement ederek oluşturmak daha çok tercih
    edilir çünkü Javada sadece bir class extend edebiliriz bu hakkımızı Thread ile
    harcamak istemeyiz.

3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?

   Evet, ancak thread oluşturulmaz.

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?

   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.


*/
public class ThreadCreation1 {
    public static void main(String[] args)  {

        //Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
        // bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.

        Sayac thread1=new Sayac("Ronaldo");
        Sayac thread2=new Sayac("Messi");
        thread1.start();
        thread2.start();

    }
}
