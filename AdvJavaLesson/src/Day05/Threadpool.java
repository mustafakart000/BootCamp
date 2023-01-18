package Day05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
    //Java da birşeyi new lemek yani object oluşturmak ram den yer alır  ve application'ın performansı düşer bu yüzden
    // Threadpool kullanırız.

    public static void main(String[] args) {
        //10 adet thread oluşturuldu.
        ExecutorService service= Executors.newFixedThreadPool(2);
        ThreadCreator thread1 = new ThreadCreator("Thread1");
        ThreadCreator thread2 = new ThreadCreator("Thread2");
        ThreadCreator thread3 = new ThreadCreator("Thread3");
        ThreadCreator thread4 = new ThreadCreator("Thread4");
        ThreadCreator thread5 = new ThreadCreator("Thread5");
        ThreadCreator thread6 = new ThreadCreator("Thread6");
        ThreadCreator thread7 = new ThreadCreator("Thread7");
        ThreadCreator thread8 = new ThreadCreator("Thread8");
        ThreadCreator thread9 = new ThreadCreator("Thread9");
        ThreadCreator thread10 = new ThreadCreator("Thread10");

        /* thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();*/
        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);
        service.execute(thread6);
        service.execute(thread7);
        service.execute(thread8);
        service.execute(thread9);
        service.execute(thread10);
        service.shutdown();// Eğer shutdown methodunu yazmazsak thread havuzunda ki thread'ler beklemeye devam eder.


    }

}
class ThreadCreator extends Thread{
        private String threadName;

    public ThreadCreator(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " thread Başladı.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName + " Thread stopped");
    }
}