package Day04;

public class Waitnotify {
    public static int balance =0;

    public static void main(String[] args) {
        Waitnotify obj = new Waitnotify();


        //thread1
        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(800);

            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();

        //thread2
        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obj.deposit(2000);
            }

        });
        thread2.setName("Deposit Thread");
        thread2.start();


    }

    //Para çekme methodu

    public void withdraw(int amount){
        synchronized (this){
            if (balance<=0 || balance < amount){
                System.out.println("Balance değeri değişesiye kadar bekliyoruz");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }//synchronized blog sonu
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        //wait işlemi bittikten sonra veya balance değeri yeterli ise
        balance = balance - amount;
    }
    public void deposit(int amount){
        balance =balance + amount;
        System.out.println("Para çekme işleminiz başarı ile gerçeklşeşmiştir: "+balance);
        synchronized (this){
            notify();
        }

    }


}
