package thread.exampleVolatile;

public class WaitNotify {

    public static int balance = 0;

    public static void main(String[] args) {
        WaitNotify obj = new WaitNotify();

        //thread1
            Thread thread1= new Thread(()->{
                try {
                    obj.withDraw(800);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread1.setName("WithDraw Thread");
            thread1.start();


        //thread2
        Thread thread2= new Thread(()->{
            try {
                Thread.sleep(5000);
                obj.deposit(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        });
        thread2.setName("deposit Thread");
        thread2.start();
    }

    //para cekme methodu

    public void withDraw( int amount) throws InterruptedException {
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                System.out.println("Balance değerin değişmesini bekleyiniz...");
                wait();
            }

        }
        // synchronized blog sonu
        Thread.sleep(5000);

        //wait işlemi bittikten sonra veya balance değeri zaten yeterli ise
        balance = balance -amount;
        System.out.println("para çekme işlemi başarılı ile gerçekleşmiştir. ");
    }

    public void deposit(int amount)throws  InterruptedException{

        balance = balance + amount;
        System.out.println("para yatırma işleminiz başarıyla gerçekleşmiştir. ");
        synchronized (this) {
            notify();
        }


    }

}
