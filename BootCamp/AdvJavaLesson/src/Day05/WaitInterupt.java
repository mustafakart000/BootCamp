package Day05;

public class WaitInterupt {
    static public int balance = 0;
    public static void main(String[] args) {
        //waitInterup, Thread wait deki threadleri beklemeden çıkarır.

        WaitInterupt obj =new WaitInterupt();
        //withdraw
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {

                obj.withdraw(800);

            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        obj.deposit(2000);
        thread1.interrupt();//thread2 burada kibarca thread1'i sonlandırıyor (((( BABA Thread))))
    }
    public void withdraw(int amount){
        synchronized (this){
            if (balance<=0 || balance < amount ){
                System.out.println("bekleme");
                try {
                    wait();
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                    balance =balance -amount;
                    System.out.println("Başarılı");
                }
            }//if sonu
            /*balance =balance -amount;
            System.out.println("Başarılı");*/

        }
    }

    public void deposit(int amount){
        balance=balance + amount;
        System.out.println("Başarılı");

    }
}

