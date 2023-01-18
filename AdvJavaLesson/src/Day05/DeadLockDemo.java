package Day05;

public class DeadLockDemo {
    // hangi durumlarda deadlock oluşur ???


    public static void main(String[] args) {
        final String lock1 ="lock1";
        final String lock2 ="lock2";

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread1, lock1 değişkeni kilitlendi.");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }synchronized (lock2){
                        System.out.println("Thread1 lock2 değişkeni kilitleyelim. ");
                    }
                }
            }
        });
        thread1.start();

        //!!!thread2:

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {

                    synchronized (lock2){
                        System.out.println("Thread1, lock1 değişkeni kilitlendi.");
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }synchronized (lock1){
                            System.out.println("Thread1 lock2 değişkeni kilitleyelim. ");
                        }
                    }


            }
        });
        thread2.start();
    }
}
