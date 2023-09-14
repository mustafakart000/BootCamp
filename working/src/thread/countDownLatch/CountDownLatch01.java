package thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch01 {

    /*
           threadleri task'lere gore sıralamaya sokmak onemli olanları on tarafta tutmak
           yani onemli olanları latch'lemek

           NOT: 4 tane worker oluşturuyoruz start ile hepsini beklemeksizin çalıştırıyor.
        */

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);

        WorkerThreads workerThreads1 = new WorkerThreads("worker-1", 5000, latch);
        WorkerThreads workerThreads2 = new WorkerThreads("worker-2", 7000, latch);
        WorkerThreads workerThreads3 = new WorkerThreads("worker-3", 9000, latch);
        WorkerThreads workerThreads4 = new WorkerThreads("worker-4", 11000, latch);


        workerThreads1.start();
        workerThreads2.start();
        workerThreads3.start();
        workerThreads4.start();


        System.out.println(Thread.currentThread().getName()+ "  2 has finished.");

        latch.await();

        System.out.println(Thread.currentThread().getName()+ "  1 has finished.");

    }
}

class WorkerThreads extends Thread{

    private int delay;

    private CountDownLatch latch;

    public WorkerThreads(String name, int delay, CountDownLatch latch){

        super(name);
        this.delay = delay;
        this.latch = latch;
    }


    @Override
    public void run()    {

        try {
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+ " çalışıyor...");
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}