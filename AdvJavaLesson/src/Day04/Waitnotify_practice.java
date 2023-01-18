package Day04;



    public class Waitnotify_practice {
        public static int balance =0 ;

        public static void main(String[] args) {
            Waitnotify_practice obj = new Waitnotify_practice();

            // thread1
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    obj.withdraw(800);
                }
            });
            thread1.setName("Withdraw Thread");
            thread1.start();

            // thread2
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    obj.deposit(2000);
                }
            });
            thread2.setName("Deposit Thread");
            thread2.start();

        }

        // para çekme methodu
        public void withdraw(int amount) {
            synchronized (this) {
                if(balance<=0 || balance <amount) {
                    System.out.println("Balance değeri değişesiye kadar bekliyoruz");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } // synchronized blog sonu

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // wait işlemi bittikten sonra veya balance değeri zaten yeterli ise
            balance = balance - amount ;
            System.out.println("Para çekim işlemi başarıyla gerçekleşmiştir");

        }

        // para yatırma methodu
        public void deposit(int amount) {
            balance = balance+amount ;
            System.out.println("Para yatırma işleminiz başarıyla gerçekleşmiştir");

            synchronized (this){
                notify();
            }
        }
    }

