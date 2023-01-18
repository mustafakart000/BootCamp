package Day05;

import java.util.concurrent.Semaphore;

public class Semaphore1 {
    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore=new Semaphore(4);
        Thread.sleep(2000);
        System.out.println("Toplam park edilebilecek yer sayısı : "+ semaphore.availablePermits());
        Car car1 = new Car("Car1", semaphore);
        car1.start();
        Car car2 = new Car("Car2", semaphore);
        car2.start();
        Car car3 = new Car("Car3", semaphore);
        car3.start();
        Car car4 = new Car("Car4", semaphore);
        car4.start();
        Car car5 = new Car("Car5", semaphore);
        car5.start();
        Car car6 = new Car("Car6", semaphore);
        car6.start();
    }//main sonu
}// public class sonu
class Car extends Thread{
    private String name;
    Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name + " park ediyor ");
        try {
            System.out.println(name+ " Park etmeye çalışıyor");
            semaphore.acquire();//park etmeye çalışıyor.
            System.out.println(name+ " park etti");

            for (int i=1; i<=4;i++){
                System.out.println(name+ " parkda " + i + "saattir bekliyor.");
                Thread.sleep(5000);

            }
            System.out.println(name+ "park yerinden ayrıldı");
            semaphore.release();// park yerinden çıktı.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}