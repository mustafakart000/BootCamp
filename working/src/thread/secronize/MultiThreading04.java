package thread.secronize;

public class MultiThreading04 {

    /* sycnhronized (this){ body }  bu ifadeyi method içerisinde eklememizin nedeni aynı methoda iki thread
      girerse ilk giren thread sycnhronized 'a girer ve işlemini tamamlayana kadar ikinci thread
      sycnhronized'a birinci thread cıkana kadar  bekler burada "this" keywod'ü de hangi thread'i işaret ettiğini
       gösterir.
        burada amac method içindeki olan bu yapı "sycnhronized (this){ body }"  işlemleri hızlı bir şekilde sonuçlandırmak ve
        thread'leri daha efektif bir biçimde kullanmayı amaçlar. */
    public static void main(String[] args) throws InterruptedException {
        long startTime =System.currentTimeMillis();
        Brackets2 brackets2 = new Brackets2();
        //thread1
        Thread thread1= new Thread(()->{
            try {
                for (int i = 0; i <8 ; i++) {

                    brackets2.generateBrackets();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        //thread2
        Thread thread2 =new Thread(()->{
            for (int i = 0; i <8 ; i++) {

                try {
                    brackets2.generateBrackets();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();
        thread1.join();
        thread2.join();
        long endTime =System.currentTimeMillis();
        System.out.println("Toplam geçen süre: " + (double) (endTime-startTime)/1000);

    }
}
class Brackets2{
    public void generateBrackets() throws InterruptedException {//Toplam geçen süre: 5.571

        synchronized (this) {//this, bu method'a giren thread'i işaret eder.
            for (int i = 0; i <= 10; i++) { //Toplam geçen süre: 3.005
                if (i <= 5) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }
            }
            System.out.println("");
        }



        for (int i = 0; i <=5 ; i++) Thread.sleep(50);
    }
}
