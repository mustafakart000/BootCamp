package thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {


        /*
          https://www.baeldung.com/thread-pool-java-and-guava

          https://www.baeldung.com/java-executor-service-tutorial

          İşletim sistemi, thread'ler arasında bağlam değiştirme işlemini gerçekleştirir. Bağlam değiştirme, işletim
          sisteminin, bir thread'in çalışmasını durdurup diğer bir thread'e geçmesini sağlar. Bu işlem, paralellik
          illüzyonu yaratmak için kullanılır. İşletim sistemi, thread'ler arasında hızlı bir şekilde geçiş yaparak,
          birden fazla işin aynı anda çalışıyormuş gibi görünmesini sağlar. Ancak gerçekte, işletim sistemi,
          CPU kaynaklarını paylaştırarak ve zaman dilimlerini bölüştürerek her bir thread'i sırayla çalıştırır.
          Bu sayede, kullanıcıya paralel bir çalışma deneyimi sunulur. Bağlam değiştirme işlemi, thread'ler arasında
           veri ve durumun aktarılmasını sağlar, böylece her thread kendi bağımsız çalışma alanında devam edebilir.

            6 task'imiz olsun ve bu taskleri her bir Thread ile eşleştirmek yerine gorevi biten thread'e yeni task vererek
            hem tasarruf saglamak ve hemde hızı korumuş oluruz.

                     T1       T2        T3
             Task    1        2         3
                   finish     2         3
                     4     finish       3
                     4        5       finish
                     4        5         6
                   finish   finish    finish gibi bir thread pool orneği verilebilir.
       */

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        ThreadCreator thread1 = new ThreadCreator("Thread1");
        ThreadCreator thread2 = new ThreadCreator("Thread2");
        ThreadCreator thread3 = new ThreadCreator("thread3");
        ThreadCreator thread4 = new ThreadCreator("Thread4");
        ThreadCreator thread5 = new ThreadCreator("Thread5");
        ThreadCreator thread6 = new ThreadCreator("Thread6");
        ThreadCreator thread7 = new ThreadCreator("Thread7");
        ThreadCreator thread8 = new ThreadCreator("Thread8");
        ThreadCreator thread9 = new ThreadCreator("Thread9");
        ThreadCreator thread10 = new ThreadCreator("Thread10");

        /*burada on tane thread oluşturmuş gibi düşünecek olsakta aslında basta belirttipimiz gibi sadece iki thread
         ile çalışırız ve gorevi tamamlanan threadlar yeni threadleri yeni görev üstlenir işte bu durum threadpool'dur*/

        /*thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
         bu yapıyı kullanmayız cunku bizim amacımız bunları bir havuz da tutmak bunun için execute
                                 method'unu kullanarak bunu sağlarız */

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
        service.shutdown();

    }



    }
class ThreadCreator extends Thread {
    //constructor


    public ThreadCreator(String threadName) {
        this.threadName = threadName;
    }

    private String threadName;

    @Override
    public void run() {
        System.out.println(threadName + " thread started. ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Name: "+ threadName);
    }





}
