package thread.secronize;

public class MultiThreading02 {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
       MultiThreading02 multiThreading02 = new MultiThreading02();
        System.out.println("public static int counter: "+ MultiThreading02.counter);
        // Ayrı 2 thread oluşturup aynı kaynağa erişmeisini sağlayalım.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread1 worked. ");
            }
        });
        thread1.start();
//        thread1.join();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println("Thread2 worked. ");
            }
        });
        thread2.start();


    }



    class Counter {
        //synchronized keywod'ü ilk hangi thread girdiyse
        // ikincisi dışarda sırada bekler ve thread işlemini
        // bitirince ikinci thread içeri girer.
        public  static synchronized void count(){
            for (int i = 1; i <=10000000 ; i++) {
                MultiThreading02.counter++;
            }
            System.out.println("Thread worked. "+ Thread.currentThread().getName());
            System.out.println("Counter: " + MultiThreading02.counter);
        }

    }
}
