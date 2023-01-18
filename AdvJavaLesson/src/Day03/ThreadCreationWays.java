package Day03;

public class ThreadCreationWays {

    public static void main(String[] args) {
        // ilk çalışan thread main thread dir, kontrol edelim :
        System.out.println("Current Thread : " + Thread.currentThread().getName()); // main

        MyThread thread1 = new MyThread();
        //thread1.run();
        thread1.start(); // thread sınıfında run() metodunda yazılanlar işlenmeye başlar
        // run() diyerekte çağırdığımızda method yine çalışıyor , start() ile çağırmamız
        // arasındaki fark : run() ile çağırıldığında thread değişmez sadece methos çalışır
        // start() da ise önce thread ayağa kalkar daha sonra içindeki run() metodu çalışır

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }


}
// 1.yol : Thread classını extend ederek
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread threadı calışıyor");
    }
}

// 2.yol : Runnable Interfacei implement ederek
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Interfaceden türetilen thread çalıştı");
    }
}