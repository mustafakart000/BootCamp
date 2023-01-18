package Day03_Practice.creation;

public class MultiThreadFindSameValue {
    //MultiThread'ler aynı kaynağa nasıl ulaşır

    public static int counter =0;

    // static variable oluşrumamızın sebebi Class ismi le kolayca çağırabiliriz aksi durumda instace variable oluşturmamı
    // gerekecek.

        /*Counter : 1000
        Thread1 çalıştı
        Counter : 2000
        Thread2 Çalıştı
         Buşekilde çalışmasını istiyorsak;*/
    public static void main(String[] args) {
//!!!Ayrı iki thread oluşturup aynı kaynağa erişmesini sağlayalım

        Thread thread1 =new Thread(new Runnable() {
            @Override
            public void run() {
                Counter2.count();
                System.out.println("Thread1 çalıştı");
            }
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2.thread2

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                Counter2.count();
                System.out.println("Thread2 Çalıştı");


            }
        });
        thread2.start();



    }
}

class Counter2 {

    public synchronized static void count(){//synchronized'e  Threadler'i methoda'a sırayla sokar.
                                                    // Bir aracın otoyıkamaya girerken işi bitene kadar diğer
                                                    // aracın beklemesini sağlayan otokapı gibi synchronized görev yapar
        for (int i=1; i<=1000; i++){
            MultiThreadFindSameValue.counter++;//1000;
        }
        System.out.println("Counter : " +MultiThreadFindSameValue.counter);
    }


}
