package thread.semaphore;

import java.util.concurrent.Semaphore;

public class Semaphore01 {

    //

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        Thread.sleep(2000);

        System.out.println("Toplam park yapılabilecek yer sayısı: "+ semaphore.availablePermits());

        Car  car1 = new Car("car1" , semaphore);
        car1.start();
        Car  car2 = new Car("car2" , semaphore);
        car2.start();
        Car  car3 = new Car("car3" , semaphore);
        car3.start();
        Car  car4 = new Car("car4" , semaphore);
        car4.start();
        Car  car5 = new Car("car5" , semaphore);
        car5.start();
        Car  car6 = new Car("car6" , semaphore);
        car6.start();
    }
}

class Car extends Thread {

    private String name;
    Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" park etmeye çalışıyor....");
            semaphore.acquire();//boş'a cıkmış Threadlerden birine ulaşmaya çalışıyor tüm threadler' doluysa beklemede kalır
            System.out.println(name+" park etti");

            for (int i = 0; i <=4 ; i++) {
                System.out.println(name + "parkda " + i + " saattir bekliyor.");
                Thread.sleep(3000);
            }

            System.out.println(name + "park yerinden ayrıldı.");

            semaphore.release(); //park yerinden cıktı...

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
