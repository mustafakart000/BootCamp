package Day03_Practice.creation;

public class MultiThreadFindSameValue02 {
    public static void main(String[] args) {
        Brackets brackets= new Brackets();
        System.out.println("============================================");
       Thread thread1= new Thread(new Runnable() {
           @Override
           public void run() {
               for(int i=0; i<=7; i++){
                   brackets.generateBrackets();
               }
           }
       });
       thread1.start();

       Thread thread2 =new Thread(new Runnable() {
           @Override
           public void run() {
               for(int i=0; i<=7; i++){
                   brackets.generateBrackets();
                }
           }
       });
       thread2.start();
    }
}


 class Brackets {//Çıktının düzgün gözükebilmesi için veya çıktının istenildiği sıralamada okunabilmesi için
    // generateBrackets() methodu'na aynı anda sadece 1 threadin girebiliyor olması gerekir ve biz durumu sağlayabilmemiz
    // için keyword'ü synchorized'ü kullanırız.
     public synchronized void generateBrackets() {
         for (int i = 1; i <= 10; i++) {
             if (i <= 5) {
                 System.out.print("[");
             } else {
                 System.out.print("]");
             }
         }
         System.out.println("");
     }
 }

