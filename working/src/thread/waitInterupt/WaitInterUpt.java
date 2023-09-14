package thread.waitInterupt;

public class WaitInterUpt {

    /*  */

    static public int balance = 0;

    public static void main(String[] args)  {

        WaitInterUpt waitInterUpt = new WaitInterUpt();
        //withDraw
       Thread thread1 = new Thread(()->{

           try {
               waitInterUpt.withdraw(4000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       });

       thread1.setName("withdraw Thread.");
       thread1.start();

      //deposit
        Thread thread2 = new Thread(()->{
            try {
                Thread.sleep(5000);// burada sleep kullanmamızın amacı cıktıları duzgun almak yoksa
                                                            // programı yavaslatmak istenen birşey değil
            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
            waitInterUpt.deposit(3000);
            thread1.interrupt(); //Thread2 burada kibarca thread1'i sonladırıyor.

        });

        thread2.setName("deposit Thread.");
        thread2.start();

    }

    public void withdraw(int amount) throws InterruptedException {
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                System.out.println("bekleme");

                wait();
            }
            balance = balance - amount;
            System.out.println("para çekme işlemi başarılı");
        }
    }

    public void deposit(int amount){
        balance= balance+amount;
        System.out.println("para yatırma işlemi başarılı");
    }
}