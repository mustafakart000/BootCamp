package thread.secronize;
/*



* */
public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        CounterWithoutMultiThread count1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread count2 = new CounterWithoutMultiThread(2);

        count1.countMe();
        System.out.println("-------------------------------------");
        count2.countMe();
        long endTime =System.currentTimeMillis();
        System.out.println("withoutmultiTHread ile geçen süre: "+(endTime-startTime));
        System.out.println("----------------with Thread---------------------");
        long startTime2=System.currentTimeMillis();
        CounterWithMultiThread count3 = new CounterWithMultiThread(1);
        CounterWithMultiThread count4 = new CounterWithMultiThread(2);
        count3.start();

        System.out.println("---------------------------İki Join Öncesi------------------------------");
        count4.start();
        count3.join();
        System.out.println("----------------------------iki join arası------------------------------");
        count4.join();
        long endTime2 =System.currentTimeMillis();
        System.out.println("withoutmultiTHread ile geçen süre: "+(endTime2-startTime2));
    }
}


//Thread'li ve Threadsiz class'lar oluşturacagız

class CounterWithoutMultiThread{

    private int threadNum;

    //Constructor

    public CounterWithoutMultiThread(int threadNum){
        this.threadNum=threadNum;
    }

    public void countMe() throws InterruptedException {
        for (int i = 0; i <=10 ; i++) {
            Thread.sleep(500);//0.5 saniye yavaşlattık.
            System.out.println("i: "+i + "thread number: "+ threadNum);

        }
    }
}
class CounterWithMultiThread extends Thread{

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
        for (int i = 0; i <=10 ; i++) {
            Thread.sleep(500);//0.5 saniye yavaşlattık.
            System.out.println("i: "+i + "thread number: "+ threadNum);

        }
    }


}
