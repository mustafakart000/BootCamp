package thread.exampleVolatile;

public class Volatile {

    /*
        thread'ler tarafından kullanılan ortak bir variable'ımız varsa ve bu da static ise veya data base de bir değere
        ulaşmak istiyorsa ve bu değişkene cok sıkı ulaşıyorsa bunu ram de saklamaz işlemcinin kendi hafızasında saklamak
        ister çünkü veriyi daha hızlı işlemek için kullanılır ancak aynı variable'a birden fazla thread ulaşmak istediğinde
        ve değiştirmek istediğinde karmaşıklığa neden oldugu için doğru veri akışını da bozmuş olur bu yüzden
        bu variable'ı ram de tutmak için variable 'ın onune "volatile" yazarak bu variable'a thread'lerin ramden ulaşabilmesini
        sağlarız. Bu durum variable'ın ram de tutulmasından dolayı bir hız kaybına neden olabilir.
        ve bu sadece değişkenler için değil object'ler uzerinden de kullanabilir.

    */
    public volatile static int flag =0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            while(true) {
                if(flag == 0){
                    System.out.println("Thread1 çalışıyor.");
                }else {
                    break;
                }
            }
        });

        thread1.start();

        Thread thread2 = new Thread(()->{

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag=1;
            System.out.println("Flag değeri 1 olarak değiştirildi.");

        });
        thread2.start();
    }

}
