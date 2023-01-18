package Day04;

public class Volatile {
    volatile public static int flag =0;
//volatile
    public static void main(String[] args) {



    //thread
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            while(true){
                if (flag==0){
                    System.out.println("Thread1 is working");
                }
                else {
                    break;
                }
            }
        }
    });
    thread1.start();
    //thread2
        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag=1;
                System.out.println("Flag değeri 1 olarak değiştirildi.");
            }
        });thread2.start();
}
}
