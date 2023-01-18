package Day04_practice.volatileKeyword;

public class Numerator {
    //volatile keywordü değişkenin main memoryde saklanmasını garanti eder ancak
    //tüm threadlerin değişkene aynı anda ulaşmasından kaynaklı çakışmaya çözme garantisi yoktur.
    //bunun için synchronized keywordü de kullanılmalı
    private volatile static int counter=0;
    public synchronized void getOrder(){
        String name=Thread.currentThread().getName();
        counter++;
        System.out.println("Sayın"+name+"Sıranız: "+counter);
    }

}
