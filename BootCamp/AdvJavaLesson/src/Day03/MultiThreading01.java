package Day03;

import java.lang.management.ThreadMXBean;

public class MultiThreading01 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);

        counter1.countMe();
        System.out.println("-----------");
        counter2.countMe();
        long endTime = System.currentTimeMillis();
        System.out.println("WithoutMultiThread ile Geçen süre : " + (endTime-startTime));
        System.out.println("*******************************");
        long startTime2 = System.currentTimeMillis();
        CounterWithMultiThread counter3 = new CounterWithMultiThread(1);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(2);
        CounterWithMultiThread counter5 = new CounterWithMultiThread(3);
        counter3.start();
        System.out.println("---------------");
        counter4.start();
        counter3.join(); // counter3 thread i bitesiye kdar bekle
        System.out.println("Priority1");
        System.out.println(counter5.getPriority());
        System.out.println("Priority2");
        System.out.println("Counter3.join-Counter4.join");
        counter4.join(); // counter4 threadi bitesiye kadar bekle
        long endTime2 = System.currentTimeMillis();
        System.out.println("WitMultiThread ile Geçen süre : " + (endTime2-startTime2));


    }
}
//Single Thread normal Reading
class CounterWithoutMultiThread {

    private int threadNum;

    // const.
    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    public void countMe() throws InterruptedException {
        for(int i=1;i<=10;i++){
            Thread.sleep(500); //0.5 saniye yavaşlattım
            System.out.println("i"+i + "Thread number : " + threadNum);
            String.valueOf(i);
        }
    }
}
//MultiThread reading at the same Time
class CounterWithMultiThread extends Thread {
    private int threadNum;

    //Constructor
    public CounterWithMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void countMe() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500); //0.5 saniye yavaşlattım
            System.out.println("i" + i + "Thread number : " + threadNum);
        }
    }
}