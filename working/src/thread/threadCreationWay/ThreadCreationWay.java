package thread.threadCreationWay;

public class ThreadCreationWay {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        System.out.println("Current Thread: "+ Thread.currentThread().getName() +":::"+mythread.getName());
        mythread.start();// thread sınıfında run methodunda yazılanlar işlenmenye başlar
        mythread.run(); //start thread'in motorudur ancak run ile de calıştırıp aynı sonucu alabiliriz ikisi arasında ki
        // temel fark şudur run thread'i create etmez thread değişmez sadece method çalışır ancak start methodu,
        // thread'i calıştırır ve içindeki run methodunu ayaga kaldırır.
        MyRunable myRunable = new MyRunable();
        Thread thread2 = new Thread(myRunable);
        thread2.start();
        myRunable.run();
        System.out.println("Current thread: "+ Thread.currentThread()+ " ::: " + myRunable.getClass());
        System.out.println(thread2.getName());





        //!! isimsiz olarak oluşturma i anonymous (interface)

        Thread thread3 = new Thread(new MyRunable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread2: "+ Thread.currentThread().getName());
                System.out.println("Bu isimsiz sınıf yoluyla oluşturalan iş parçacığıdır.");
                a();
                b();
            }
        });
        thread3.setName("Thread-3");//Thread'isimlendirme
        thread3.start();


        Thread thread4 =new Thread(()->{
            System.out.println("Lambda ile yazıldı.");

        });

        thread4.start();

        Thread thread5 = new Thread(()->{
            System.out.println("thread5 çalıştı");
        });
        thread5.start();

    }

    public  static void a() {

        System.out.println("1"+ 2*3*4*5*6*7*343*34*34*3*43*4*34*3*43*4*34*34*3*43*4*34*34*3*4);
    }
    public  static void b() {
        System.out.println("2");
    }
}
